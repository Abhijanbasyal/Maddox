import datetime

#creating the variable for dictionary
dictionary={}

#creating the variable for list
list1 = []
list2 = []

#creating option for renting
def renting():
       print("**"*20)
       print("          Rent a costume here ")
       print("**"*20)
       
       boln = True
       while boln == True:
          
          c = 0 #using counter
         #Heading of the table 
          print("___"*30)
          print("{:<16}{:<24} {:<20} {:<4} {:>17} ".format("ID_no","Name","Brand","Price","Quantity"))
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

          ID_no = int(input("\n Enter the ID_no of costume which do you want to rent = ")) #taking the costumer inputs of id no.
         
          if ID_no > 0 and ID_no <= c:
             list1.append(dictionary[ID_no][0])
             list2.append(dictionary[ID_no][1])
             print("\n-----------------------------------------------------------------------")
             print("          You can rent the costume now as the costume is available       ")
             print("-------------------------------------------------------------------------")
             q = int(input("\n Enter the quantity of costume which do you want to rent =")) #Taking the quantity of costume chosen by the costumer
             quantity = dictionary[ID_no][3] #Quantity of costume present in the stock

             if int(quantity) >= q > 0:
                 new_quantity = int(quantity) - q
                 print("\n The quantity for the costume is = ",new_quantity)
                 dictionary[ID_no][3] = quantity
                 dictionary[ID_no][3] = new_quantity
                 print(dictionary,"\n")
                 name_of_customer = input("\n Please,Enter your name = ")
                 dictionary[ID_no][3] = " " + str(new_quantity)
                 singleprice = float(dictionary[ID_no][2].replace("$", ""))
                 total_price = int(q) * singleprice
                 print("\n The total price of the rented costume is = ",dictionary[ID_no][2])
                 print("----------------------------------------------------------------------")
                 print("             Would you like to rent our costume again?                ")
                 print("----------------------------------------------------------------------")
                 v = True
                 while v:
                        option = input(" If you want to rent more, please enter Y or y; otherwise, enter N or n  = ")
                        
                        if option == 'y' or option == 'Y':
                            print("\n============================================================")
                            print("             Thank you for renting more                     ")
                            print("============================================================\n")
                            
                            dictionary[ID_no][3] = str(new_quantity)
                            table()
                            bill_of_rents = open("rentbill.txt","a+")
                            bill_of_rents.write("\n*********************************************************************************")
                            bill_of_rents.write("\n                   PALAZ COSTUME RENTAL SHOP                                   ")
                            bill_of_rents.write("\n                             Costumer Bill                                       ")
                            bill_of_rents.write("\n*********************************************************************************")
                            bill_of_rents.write("\nName of the customer = "+ name_of_customer)
                            date_time = datetime.datetime.now()
                            bill_of_rents.write("\nDate and  time of renting = "+date_time.strftime("%c"))
                            bill_of_rents.write('\nTotal price is = '+str(total_price))
                            bill_of_rents.write("\nItem rented = "+ list1[0]+ ","+ list2[0])
                            bill_of_rents.write("\n_________________________________________________________________________________")
                            bill_of_rents.close()
                            renting()
                        elif option == 'n' or option == 'N':
                            boln = False 
                            print("\n*********************************************************************************")
                            print("                             Costumer Bill                                       ")
                            print("*********************************************************************************")
                            print("Name of the customer = ",name_of_customer)
                            date_time = datetime.datetime.now()
                            print("Date and  time of renting = ", date_time.strftime("%c"))
                            print('Total price is = ',total_price)
                            print("Item rented = ", list1, ",", list2)
                            print("_________________________________________________________________________________")
                            table()
                            bill_of_rents = open("rentbill.txt","a+")
                            bill_of_rents.write("\n*********************************************************************************")
                            bill_of_rents.write("\n                   PALAZ COSTUME RENTAL SHOP                                   ")
                            bill_of_rents.write("\n                             Costumer Bill                                       ")
                            bill_of_rents.write("\n*********************************************************************************")
                            bill_of_rents.write("\nName of the customer = "+ name_of_customer)
                            date_time = datetime.datetime.now()
                            bill_of_rents.write("\nDate and  time of renting = "+date_time.strftime("%c"))
                            bill_of_rents.write('\nTotal price is = '+str(total_price))
                            bill_of_rents.write("\nItem rented = "+ list1[0]+ ","+ list2[0])
                            bill_of_rents.write("\n_________________________________________________________________________________")
                            bill_of_rents.close()
                            print("\n")
                            v = False
                        else:
                            print("Please enter the correct value")
                            print("Press any key to continue")
                            input()


             else:   
                 print("\n---------------------------------------------------------------------------------------------------------------")
                 print("  Our apologize sir/madam,we don't have the quantity which you have entered.Please,Check and enter the available quantity")
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
            
             
def table():
    f = open("datafiles.txt", "w")
    for value in dictionary.values():
        string = ",".join(value)
        f.write(string)
        f.write("\n")
    f.close()

