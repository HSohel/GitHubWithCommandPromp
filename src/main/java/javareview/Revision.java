package javareview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
enum Level{
    HIGH, MEDIUM, LOW
};
public class Revision {
  Level level;

    public Revision(Level level) {
        this.level = level;

    }
        public void tryLevel(){
            switch (level){

                case HIGH:
                    System.out.println("It's High");
                    break;

                case MEDIUM:
                    System.out.println("It's Medium");
                    break;

                case LOW:
                    System.out.println("It's low");
                    break;
                default:
                    System.out.println("No Level");

            }

        }



    }
