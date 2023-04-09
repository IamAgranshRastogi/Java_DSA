package Maths;
/*Sieve of Eratosthenes is a simple and ancient algorithm 
used to find the prime numbers up to any given limit.
It is one of the most efficient ways to find small prime numbers. */


import java.util.Scanner;
public class Prime_Num4 
{ public static void main(String[] args) 
  { Scanner s=new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int n=s.nextInt();

    // to store true/false for Prime
    boolean []primes = new boolean[n+1]; 
    // n+1 because we are storing n also

    sieve(n,primes); // calling function
    s.close();
  }
  static void sieve(int n,boolean []primes)
  { 
    System.out.println("All Primee Numbers till Number : ");
    for(int i=2;i*i<=n;i++) //checking till factor square < = number
    { if(!primes[i]) // if primes false at i ( is prime )
      { for(int j=i*2;j<=n;j+=i) // for multiples of i 
        { primes[j]=true;  // all true( not prime )
        }
      }
    }
    for(int i=2;i<=n;i++) // printing only prime numbers
    { if(!primes[i])// if prime
      { System.out.println(i+" "); 
      } 
    }
  }
    
}
// TC : n/2 + n/3 + n/5 + .... + n/p
// where p is greatest prime number less than 'n' .

// => TC: O(n * log(log n))  