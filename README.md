String Calculator									
It is an simple calculator capable of extracting integer values from string with delimiters combined.									
The Code goes as follows :									
    Created a Scanner object to catch the user input in as in String format.									
     Then sent to add method where it is get validated									
     The Add(String str) consists of sevaral check condition such as									
                    1. Check for emptyString()									
                    2.  Check for input with three digits and comma separated integers(1,2)									
                    3.  Check for input with several delimiters like "!@#$%^&*()[]{};':",.<>/?"									
                    4.  Check for input with negative integers - throws IllegalArgumentException									
                    5.  Check for input with integers exceed 1000 - throws IllegalArgumentException									
                     6.  Check for input with multiple delimiters consequently "!!!!!!!!1@@@@@@@@@@@@##434###$%^&2*()[]{};'7:",.<>/?"									
									
       Also I have created a TestClass with jUnit and it goes as follows									
                  1.  Test Case One - Checking for emptyString									
                . 2 Test Case Two - Checking for three character string with comma separated number									
                  3.  Test Case Three - Checking with mixed characters and numbers									
                   4.Test Case Four - Checking with mixed delimiters and numbers									
                   5.Test Case Five - Checking with no numbers									
                   6. Test Case Six - Checking with valid input with multiple mixed delimiters									
                    7. Test Case Seven - Checking for the input exceeds 1000									
                    8. Test Case Eight - Checking for negative integers in the input									
                    9. Test Case Nine - Checking with ,\n in the input along with numbers									
                   10. Test Case Ten - Checking with Input with comma(,), almost all keyboard symbols									
