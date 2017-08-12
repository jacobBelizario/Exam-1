package com.funcpro.major1

object Major1WS {
  val str = "ffb";                                //> str  : String = ffb
  def fizzString(x:String): String = {
   if((x.startsWith("F") || x.startsWith("f")) && (x.endsWith("B") || x.endsWith("b"))){
   		return("FizzBuzz");
	   }else if(x.startsWith("F") || x.startsWith("f")){
	     return("Fizz");
	   } else if(x.endsWith("B") || x.endsWith("b")){
 	   return("Buzz");
 	   } else{
 	    return(x);
 	   }
 	}                                         //> fizzString: (x: String)String
  fizzString(str);                                //> res0: String = FizzBuzz
  
  def factorial(x:Int):Unit ={
				  if(x!=0){
				   val ans =(x*(x-1));
				  	
				   }
	}                                         //> factorial: (x: Int)Unit
	factorial(1);
	factorial(2);
	factorial(5);
}
  