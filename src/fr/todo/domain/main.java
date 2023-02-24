package fr.todo.domain;

import java.util.LinkedList;
import java.util.Scanner;

import fr.todo.model.Todo;
import fr.todo.model.Urgence;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Todo> todolist = new LinkedList<Todo>();
		 int cx ;
    	 do {
    		 
    		    System.out.println( "Menu: \n"
    		    		+ "1) Ajouter un todo\r\n"
    		    		+ "2) voir les todos\r\n"
    		    		+ "3) retirer et afficher un todo par index\r\n"
    		    		+ "4) retirer et afficher le dernier todo\r\n"
    		    		+ "5) quitter \r\n");
    		    
    		    Scanner in = new Scanner(System.in);
    		    cx = in.nextInt();
    		    switch ( cx ) {
    		        case 1: {  
    		        	        Scanner s = new Scanner(System.in);
    		                    System.out.println(" insert titre :");
    		                    String a  = s.nextLine();
    		                    System.out.println(" insert description :");
    		                    String b  = s.nextLine();
    		                    int c=0;
    		                    do {
	    		                    System.out.println(" insert Urgence (0:HAUTE, 1:NORMALE, 2:FAIBLE) :");
				                    c  = s.nextInt();
    		                    } while (c<0 || c>2);
    		                    Todo t= new Todo(a, b,Urgence.values()[c]);
    		                    System.out.println(" todo : " + t.toString());
    		                    todolist.add(t);
    		                    break;
    		                  }
    		        case 2: {
		    		        	for(Todo todo : todolist)
			                    System.out.println(todo.toString());
    		                    break;
    		                  }
    		        case 3: {
		    		        	Scanner s = new Scanner(System.in);
			                    System.out.println(" insert un index a retirer :");
			                    int r  = s.nextInt();
			                    System.out.println(" deleted todo : " + todolist.get(r).toString());
			                    todolist.remove(r);
			                    break;
    		                  }
    		        case 4: {
		    		        	
			                    System.out.println(" deleted todo : " + todolist.getLast().toString());
			                    todolist.pollLast();
			                    break;
    		                  }
    		         case 5: {
    		        	        System.out.println(" thanks ");
    		                    break;
    		                  }
    		       default : System.out.println("please insert number in menu ");
    		    }

    		} while ( cx != 5 );

    	 System.out.println(" bye bye ");
	}

}
