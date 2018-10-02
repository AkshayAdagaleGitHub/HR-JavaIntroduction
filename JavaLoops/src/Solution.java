import java.util.*;

import java.io.*;

class Solution{
	public static void main(String []argh){
		Scanner in = new Scanner(System.in);
		int s=0;
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			s=a;
			for(int x=0;x<n;x++) {
				s = s + ((int) Math.pow(2, x)*b);
				System.out.print((s)+" ");         
			}  
			System.out.println();
		}
		in.close();
	}
}

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		 Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
		Scanner sc = new Scanner(System.in);
		Boolean t;
		String s;
		int i =1;
		while((t = sc.hasNextLine())){
			s=sc.nextLine();
			System.out.println(i+ " "+ s.toString());
			i++;
		}
	}
}*/

/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	private static boolean flag = initializeInstanceVariable();
	private static int B;
	private static int H;

	protected final static boolean initializeInstanceVariable(){
		Scanner sc= new Scanner(System.in);
		B=sc.nextInt();
		H=sc.nextInt();
		if(B>=0 && H>=0) {
			return true;
		}else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		return false;
	}
	
	public static void main(String[] args){	
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}//end of main

}//end of class
*/
/*
import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   String s = String.valueOf(n);
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}
*/
/*
static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
    int n = scores[0];
    int lowerLs= lowerLimits[0];
    int upperLs = upperLimits[0];
    
    int arr1[] = new int[lowerLs];
    int arr2[] = new int[lowerLs];
    if(lowerLs==1){
        int lowerFrom = lowerLimits[1];
        int upTo = upperLimits[1];
    }else if(lowerLs>1){
        for(int i =0;i<lowerLs;i++){
             arr1[i] = lowerLimits[i+1];
             arr2[i] = upperLimits[i+1];
        }
    }
    LinkedList<Integer> ls = new LinkedList();
    LinkedList<Integer> ls2 = new LinkedList();
    int numberOfElementsif1=0;
    int numberOfElementsif2=0;
    int numberOfElementsif21=0;
    if(lowerLs==1){
    for(int j=0;j<n;j++){
        if(scores[j]>=arr1[0] && scores[j]<=arr1[0]){
            numberOfElementsif1++;
            ls.add(scores[j]);
        }
    }   
    }else if(lowerLs>1){
     for(int j=0;j<n;j++){
        if(scores[j]>=arr1[0] && scores[j]<=arr1[0]){
            numberOfElementsif2++;
            ls.add(scores[j]);
        }
    }
    for(int j=0;j<n;j++){
        if(scores[j]>=arr1[1] && scores[j]<=arr1[1]){
            numberOfElementsif21++;
        ls2.add(scores[j]);
        }
    }
    }
    int result[] = new int[1];
    LinkedList<Integer> resultLs= new LinkedList();
    
    if(lowerLs==1){
        result[0] = numberOfElementsif1;
    }else {
        resultLs.add(ls.size());
        resultLs.add(ls2.size());
     
    }
     int outResult[]= new int[resultLs.size()];
    for(int x=0;x<ls.size();x++){
        result[x] = ls.get(x);
    }
    if(lowerLs==1){
        return result;
    }else {
        return outResult;
    }
}*/
\\\\\\\\\\\\\\\\\\\
/*function fetchData(substr){
	  pageNum=1;
	  let url = 'https://jsonmock.hackerrank.com/api/movies/search/?Title=' + substr + "&page=" + pageNum;
	  fetch(url)
	  .then((resp) => resp.json())
	  .then(function(data) {
	    let movies = data.data;
	    let totPages = data.total_pages;
	    let sortArray = [];
	    for(let i=0; i<movies.length;i++){
	        sortArray.push(data.data[i].Title);
	     }
	    for(let i=2; i<=totPages; i++){
	           let newPage = i;
	           let url1 = 'https://jsonmock.hackerrank.com/api/movies/search/?Title=' + substr + "&page=" + newPage;
	          
	          fetch(url1).then(function(response) {
	              var contentType = response.headers.get("content-type");
	              if(contentType && contentType.indexOf("application/json") !== -1) {
	                return response.json().then(function(json) {
	                  //console.log(json); //uncomment this console.log to see the JSON data.
	                
	                 for(let i=0; i<json.data.length;i++){
	                    sortArray.push(json.data[i].Title);
	                 }
	                  
	                 if(i==totPages)console.log(sortArray.sort());
	                
	                });
	              } else {
	                console.log("Oops, we haven't got JSON!");
	              }
	            });
	            
	        }
	  })
	  .catch(function(error) {
	    console.log(error);
	  });   
	}

	function fetchActualData(substr, result = [], currentPage = 1, totalPage = 1) {
	  const fetchMovies = () => {
	    let url = 'https://jsonmock.hackerrank.com/api/movies/search/?Title=' + substr + "&page=" + currentPage;
	    return fetch(url)
	      .then((resp) => resp.json())
	      .then((data) => {
	        let movies = data.data;
	        let totPages = data.total_pages;
	        let sortArray = result.length > 1 ? [].concat(result) : [];
	        
	        for(let i=0; i < movies.length; i++){
	          sortArray.push(data.data[i].Title);
	        }
	        
	        return {
	          movies: sortArray.sort(),
	          currentPage: currentPage + 1,
	          totalPage: totPages,
	        }
	        
	        return sortArray.sort();
	      });
	  }
	  
	  if (currentPage > totalPage) {
	    console.log(result);
	    return result;
	  } else {
	    const newData = fetchMovies();
	    newData.then((data) => {
	      return fetchActualData(substr, data.movies, data.currentPage, data.totalPage);
	    });
	  }
	}
	 
	 

	//primary function 
	function getMovieTitles(substr){
	  fetchActualData(substr, []);
	}

	getMovieTitles("spiderman");
	
	\\\\\\\\\\\\\\
	
	var https = require('https');

	function fetchData(substr) {
	    pageNum = 1;
	    let url = 'https://jsonmock.hackerrank.com/api/movies/search/?Title=' + substr + "&page=" + pageNum;
	    https.get(url, (res) => {
	        res.setEncoding('utf8');
	        res.on('data', function(body) {
	            let dataRec = JSON.parse(body);
	            let movies = dataRec.data;
	            let totPages = dataRec.total_pages;
	            let sortArray = [];
	            movies.map((a) => {
	              sortArray.push(a.Title)
	            })
	            for (let i = 2; i <= totPages; i++) {
	                let newPage = i;
	                let url1 = 'https://jsonmock.hackerrank.com/api/movies/search/?Title=' + substr + "&page=" + newPage;
	                https.get(url1, (res) => {
	                    res.setEncoding('utf8');
	                    res.on('data', function(body) {
	                        let newData = JSON.parse(body);
	                        let newMovies = newData.data;
	                        for (let i = 0; i < newMovies.length; i++) {
	                            sortArray.push(newMovies[i].Title.);
	                        }
	                        console.log(sortArray.sort();
	                    })
	                })
	            }
	        })
	    })
	}

	//primary function 
	function getMovieTitles(substr) {
	    fetchData(substr);
	}*/