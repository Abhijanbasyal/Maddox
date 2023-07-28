

import datetime

#creating the variable for dictionary
dictionary={}

#creating the variable for list
list1 = []
list2 = []


def returning():
        print("**"*20)
        print("          Return a costume here ")
        print("**"*20)
        
        boln = True
        while boln == True:
            
            c = 0  # using counter
            # heading of the table
            print("___"*30)
            print("{:<16}{:<24} {:<20} {:<4} {:<17} ".format("ID_no","Name","Brand","Price","Quantity"))
            print("___"*30)
            file = open("datafiles.txt" , "r")
            f1 = file.read()
            f1 = f1.split("\n")


            for i in range(len(f1)):
                c = c + 1
                dictionary[c] = (f1[i].split(","))

            for key,value in dictionary.items():
                print(key, end="\t\t")

                for i in value:
                    print(i, end="\t\t")
                  #print("{:<20}{:<40} {:<20} {:<8} {:<8} ".format((i["ID_no"]),i["Name"],i["Brand"],(i["Price"]),(i["Quantity"])))
                print("\n")

                print("---"*30)

            ID_no = int(input("\nEnter the ID_no of the costume which do you want to return = "))  # costume ID_no which the costumer inputs

            if ID_no > 0 and ID_no <= c:
                list1.append(dictionary[ID_no][0])
                list2.append(dictionary[ID_no][1])           
                print("\n-----------------------------------------------------------------------")
                print("                    You can return the costume now                       ")
                print("-------------------------------------------------------------------------")
                q = int(input("\n Enter the quantity of costume which do you want to return =")) #Taking the quantity of costume chosen by the costumer
                quantity = dictionary[ID_no][3] #Quantity of costume present in the stock

                if int(quantity) >= q > 0:
                    print("----------------------------------------------------------------------")
                    print("        You can return the costume now as the quantity is fine        ")
                    print("----------------------------------------------------------------------")
                    new_quantity = int(quantity)  + q
                    print("\n The quantity for the costume is = ",new_quantity)
                    dictionary[ID_no][3] = quantity
                    dictionary[ID_no][3] = new_quantity
                    print(dictionary, "\n")
                    name_of_customer = input("\n Please,Enter your name = ")
                    dictionary[ID_no][3] = " " + str(new_quantity)
                    singleprice = float(dictionary[ID_no][2].replace("$", ""))
                    total_price = int(q) * singleprice
                    print("\n The total price of the returun costume is = ",dictionary[ID_no][2])
                    print("----------------------------------------------------------------------")
                    print("             Would you like to return our costume again?                ")
                    print("----------------------------------------------------------------------")
                    v = True
                    while v:
                            option = input(" If you want to return more, please enter Y or y; otherwise, enter N or n  = ")

                            if option == 'y' or option == 'Y':
                                print("\n============================================================")
                                print("             Thank you for returning more                     ")
                                print("============================================================\n")
                                boln = False
                                dictionary[ID_no][3] = str(new_quantity)
                                table()
                                bill_of_returns = open("returnsbill.txt","a+")
                                bill_of_returns.write("\n*********************************************************************************")
                                bill_of_returns.write("\n                   PALAZ COSTUME RENTAL SHOP                                   ")
                                bill_of_returns.write("\n                             Costumer Bill                                       ")
                                bill_of_returns.write("\n*********************************************************************************")
                                bill_of_returns.write("\nName of the customer = "+ name_of_customer)
                                date_time = datetime.datetime.now()
                                bill_of_returns.write("\nDate and  time of returning = "+date_time.strftime("%c"))
                                bill_of_returns.write('\nTotal price is = '+str(total_price))
                                bill_of_returns.write("\nItem returned = "+ list1[0]+ ","+ list2[0])
                                bill_of_returns.write("\n_________________________________________________________________________________")
                                bill_of_returns.close()
                                returning()
                            elif option == 'n' or option == 'N':
                                boln = False
                                print("\n\n")
                                print("------------------------------------------------------------------------")
                                days = int(input("For how many day you have rent the costume? = "))
                               
                                if int(days) > 5:
                                    print('\n Sorry, you have to pay the fine as you have rented the costume for more than 5 day')
                                    if q > 5:
                                     qfine = q - 5
                                     Fine = qfine * 10
                                     total_price = total_price + Fine
                                     print('\nTotal Fine = ',Fine)
                                    elif  q == 5:
                                        qfine = 5
                                        Fine = qfine * 10
                                        total_price = total_price + Fine
                                        print('\nTotal Fine = ', Fine)
                                    else:
                                        qfine = 5 -q
                                        Fine = qfine * 10
                                        total_price = total_price + Fine
                                        print('\nTotal Fine = ', Fine)

                                print("\n*********************************************************************************")
                                print("                             Costumer Bill                                       ")
                                print("*********************************************************************************")
                                print("Name of the customer = ",name_of_customer)
                                date_time = datetime.datetime.now()
                                print("Date and  time of returning =  ", date_time.strftime("%c"))
                                print('Total price is = ', total_price)
                                print("Item returned = ", dictionary[ID_no][0], ",", dictionary[ID_no][1])
                                print("_________________________________________________________________________________")
                                table()
                                bill_of_returns = open("returnsbill.txt","a+")
                                bill_of_returns.write("\n*********************************************************************************")
                                bill_of_returns.write("\n                   PALAZ COSTUME RENTAL SHOP                                   ")
                                bill_of_returns.write("\n                             Costumer Bill                                       ")
                                bill_of_returns.write("\n*********************************************************************************")
                                bill_of_returns.write("\nName of the customer = "+ name_of_customer)
                                date_time = datetime.datetime.now()
                                bill_of_returns.write("\nDate and  time of returning = "+date_time.strftime("%c"))
                                bill_of_returns.write('\nTotal price is = '+str(total_price))
                                bill_of_returns.write("\nItem returned = "+ list1[0]+ ","+ list2[0])
                                bill_of_returns.write("\n_________________________________________________________________________________")
                                bill_of_returns.close()
                                
                                print("\n")
                                v = False
                            else:
                                print("Please enter the correct value")
                                print("Press any key to continue")
                                input()

    
                else:
                   print("\n---------------------------------------------------------------------------------------------------------------")
                   print("  Our apology sir/madam,we don't have the quantity which you have entered.Please,Check and enter the available quantity")
                   print("---------------------------------------------------------------------------------------------------------------")
                   print("\n")
                   print("Press any key to continue")
                   input()    
            else:
               print("\n------------------------------------------------------------------------------")
               print("                  Please, enter the ID number present in the stock              ")
               print("\n---------------------------------------------------------------------------   ")
               print("Press any key to continue")
               input()
               table()

def table():
    print("stock tabled")
    f = open("datafiles.txt", "w")
    for value in dictionary.values():
        string = ",".join(value)
        f.write(string)
        f.write("\n")
    f.close()

