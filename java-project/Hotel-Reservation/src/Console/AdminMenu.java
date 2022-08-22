package Console;

import static model.roomType.valueOf;

import java.util.Scanner;

import api.AdminResource;
import model.roomType;

public class AdminMenu {

    public static int navigateToMainMenu = 6;
    public static Scanner input;
    private static AdminResource adminResource;

    public static AdminResource getAdminResource() {
        return adminResource;
    }
    public static void setAdminResource(AdminResource adminResource) {
        AdminMenu.adminResource = adminResource;
    }
    public static void display_Menu() {
        System.out.println("Admin Menu");
        System.out.println("1 - All Customer List");
        System.out.println("2 - All Room List");
        System.out.println("3 - All Reservations");
        System.out.println("4 - Add a Room");
        System.out.println("5 - Return to Main");
    }
    /**
     * 
     */
    public static void addAHotelRoom(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the Room Number of the Room you wish to Add:");
            String roomID = scanner.next();
            System.out.println("Single Or A Double Room");
            roomType roomType = valueOf(scanner.next());
            System.out.println("Enter the Room Price per Night");
            Double roomCost = scanner.nextDouble();

            AdminResource.createRooms(roomID, roomCost, roomType);
        }
    }
    public static void startAdmin() {
        input = new Scanner(System.in);
        int selection = 4;


        while (selection != navigateToMainMenu) {


            switch (selection) {
                case 1:
                    System.out.println("You requested All Customers");
                    System.out.println(AdminResource.getAllCustomer());
                    break;

                case 2:
                    System.out.println("You requested All Rooms");
                    System.out.println(AdminResource.getAllRooms());
                    break;
                case 3:
                    System.out.println("You requested All Reservations");
                    System.out.println(AdminResource.getAllReservations());
                    break;
                case 4:
                    System.out.println("Add a room to the Hotel Reservation System");
                    addAHotelRoom();
                    break;
                case 5:
                    MainMenu.mainMenu();
                   break;


                }
            display_Menu();
            selection = input.nextInt();
            }
        }
}