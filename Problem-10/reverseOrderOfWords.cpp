/*

Author : ngnishchay191 (Nishchay Gupta)
College : Maharaja Agrasen Institute Of Technology, New Delhi
Year/Department : 2nd Year/CSE
E-Mail Id : ngnishchay191@gmail.com

*/
#include<iostream> 
#include<string> 
#include <stdio.h>
  
using namespace std; 
  
string ReverseWords(string str) 
{ 
    int i = str.length() - 1; 
    int start, end = i + 1; 
    string result = ""; 
      
    while(i >= 0) 
    { 
        if(str[i] == ' ') 
        { 
            start = i + 1; 
            while(start != end) 
                result += str[start++]; 
              
            result += ' '; 
              
            end = i; 
        } 
        i--; 
    } 
    start = 0; 
    while(start != end) 
        result += str[start++]; 
      
    return result; 
} 
  

int main(int argc, char** argv) 
{ 
    string str;
    getline (cin, str); 
      
    cout << ReverseWords(str); 
      
    // return 0; 
} 