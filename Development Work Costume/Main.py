
import Rent as RT
import Return_ as RN
import sys

#creating the function for the option to rent,return and exit
def menu_():
    print("\t\t"+ "##" * 28)
    print("\t\t\t  WELCOME TO PALAZ COSTUME RENTAL SHOP ")
    print("\t\t"+ "##" * 28)
    print("\nSelect a desirable option to continue: \
        \n(1) || Press 1 to rent a costume. \
        \n(2) || Press 2 to return a costume. \
        \n(3) || Press 3 to exit. ")

    while True:
        #taking the customer choice and running the program along with the customer choice
        try:
            customer_choice = int(input('\nPlease,Enter the option you want to select:'))
            if customer_choice == 1:
                RT.renting()
                menu_()
            elif customer_choice == 2:
                RN.returning()
                menu_()
            elif customer_choice == 3:
                print("Thankyou for visiting us(人 •͈ᴗ•͈)")
                print("==="*38)
                sys.exit()
            else:
                print("This option is not available,Please choose from give option")
        except ValueError:
            print("Invalid Input !! , Please enter the correct option")
menu_()
