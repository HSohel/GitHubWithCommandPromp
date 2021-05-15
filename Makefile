#Test Execution variable
TEST_ENV=local
TEST_BROWSER=chrome

.PHONY : test
test:
ifeq ($(TEST_ENV), remote)
	docker-compose up --detach && \
	mvn clean test -Denvironment=${TEST_ENV} -Dbrowser=${TEST_BROWSER} && \
	docker-compose down
else
	mvn clean test -Denvironment=${TEST_ENV} -Dbrowser=${TEST_BROWSER}
endif