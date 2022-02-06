package az.iktlab.booking;

import az.iktlab.booking.controller.ControllerEx;
import az.iktlab.booking.exception.CommandNotFoundException;

import java.util.Scanner;

public class ConsoleApp {
    private static Scanner sc= new Scanner(System.in);
    private static ControllerEx cs=new ControllerEx();
    public static void run(){
        while(true){
            System.out.println("1.Online-board");
            System.out.println("2.Show the flight info");
            System.out.println("3.Search and book a flight");
            System.out.println("4.Cancel the booking.");
            System.out.println("5.My flights.");
            System.out.println("6.Exit");
            System.out.print("Command: ");
            int command=sc.nextInt();

            if(command==1){
                cs.show();
            }
            else if(command==2){
                cs.info();
            }
            else if(command==3){
                cs.booking();
            }
            else if(command==4){
                cs.cancelBook();
            }
            else if(command==5){
                cs.flights();

            }
            else if(command==6){
                break;
            }
            else{
                try {
                    throw new CommandNotFoundException();
                }
                catch (CommandNotFoundException e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
