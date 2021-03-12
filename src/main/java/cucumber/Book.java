package cucumber;

import java.util.ArrayList;

public class Book {
	
	String Author;
	String Title;
	String ISBN;
	String Signiture;
	Book c ;
	ArrayList  <Book> lib=new ArrayList<Book>();
	public Book()
	{
		
	}
	public Book(String author,String title,String isbn ,String sign)
	{
	Author =author;
	Title =title;
	ISBN=isbn;
	Signiture =sign;
	}
	public void bookSearchTitle(ArrayList<Book>lib,String subtit )
	{ 
		System.out.println();
		System.out.println("when user searchs for one book by title:");
		for(Book d:lib)
		{ String tit=d.Title;
		  int f=tit.indexOf(subtit);
			if(f!=-1)
				c=d;
		}
		if(c!=null)
		System.out.print(c.Title+" "+c.ISBN+" "+c.Author+" "+c.Signiture+"\n");
		else
			System.out.print("no book contain"+subtit+"in this title");
	}
	public void bookSearchmoreTitle(ArrayList<Book>lib,String subtit )
	{ 
		System.out.println();
		System.out.println("when user searchs for more than one book by title:");
		for(Book d:lib)
		{ String tit=d.Title;
		  int f=tit.indexOf(subtit);
			if(f!=-1)
			{
				c=d;
				System.out.print(c.Title+" "+c.ISBN+" "+c.Author+" "+c.Signiture+"\n");
			}
		}
		if(c==null)
			System.out.print("no book contain"+subtit+"in this title");
	}
	public void bookSearchauthor(ArrayList<Book>lib,String author )
	{ System.out.println("when user searchs for one book by auther:");
		for(Book d:lib)
		{ String tit=d.Author;
		  int f=tit.indexOf(author);
			if(f!=-1)
				c=d;
		}
		if(c!=null)
		System.out.print(c.Title+" "+c.ISBN+" "+c.Author+" "+c.Signiture+"\n");
		else
			System.out.print("no book contain"+author+"in this title");
	}
	public void bookSearchmoreauthor(ArrayList<Book>lib,String author )
	{ 
		System.out.println();
		System.out.println("when user searchs for more than one book by author:");
		for(Book d:lib)
		{ String tit=d.Author;
		  int f=tit.indexOf(author);
			if(f!=-1)
				{c=d;
			
				System.out.print(c.Title+" "+c.ISBN+" "+c.Author+" "+c.Signiture+"\n");
				}
		}
		if(c==null)
		
			System.out.print("no book contain"+author+"in this title");
	}
	public void bookSearchISBN(ArrayList<Book>lib,String isbn )
	{ 
		System.out.println();
		System.out.println("when user searchs for  one book by ISBN:");
		for(Book d:lib)
		{ String tit=d.ISBN;
		  int f=tit.indexOf(isbn);
			if(f!=-1)
				c=d;
		}
		if(c!=null)
		System.out.print(c.Title+" "+c.ISBN+" "+c.Author+" "+c.Signiture+"\n");
		else
			System.out.print("no book contain"+isbn+"in this title");
	}
	
	public void bookSearchmoreISBN(ArrayList<Book>lib,String isbn )
	{ 
		System.out.println();
		System.out.println("when user searchs for more than one book by ISBN:");
		for(Book d:lib)
		{ String tit=d.ISBN;
		  int f=tit.indexOf(isbn);
			if(f!=-1)
			{
				c=d;
				System.out.print(c.Title+" "+c.ISBN+" "+c.Author+" "+c.Signiture+"\n");
			}
		}
		if(c==null)
			System.out.print("no book contain"+isbn+"in this title");
	}
	
	
	//Book  b1 =new Book("dav bikker","dog man","1338680455","2002");
	//Book  b2 =new Book("caste","isable","0593230256","2003");
	//Book  b3 =new Book("promised man","barak","1338680455","2004");
	
	public void addBook(ArrayList<Book>lib,Book b)
	{
		//lib.add(b1);
		//lib.add(b2);
		//lib.add(b3);
		if(b.cheackISBN(b.ISBN)&&b.checkSign(lib, b))
			lib.add(b);
		
	}
	public boolean cheackISBN(String isbn)
	{ int sum=0 ;
		if(isbn.length()!=10)
		{
			return false;
		}
		else
		{
			for(int i=0;i<9;i++)
			{
				int b = isbn.charAt(i)-'0';
				if(b<0||b>9)
					return false;
				sum+=(b*(10-i));
			}
			char last=isbn.charAt(9);
			if(last!='X'&&(last<'0'||last>'9'))
				return false;
			sum+=(last=='x')?10:(last-'0');
			return (sum%11==0);
		}
		
	}
	public boolean checkSign(ArrayList<Book>b ,Book a)
	{
		for(Book c:b)
		{
		if(c.Signiture.equalsIgnoreCase(a.Signiture))
			return false;
		}
		return true;
	}
	public void printBook(ArrayList<Book>b )
	{
		System.out.println();
		System.out.println("the list of bookksin my library: ");
		for(Book c:b)
		{
		System.out.print(c.Title +" "+c.ISBN+" "+c.Signiture+" "+c.Author+"\n");
		}
		
	}
}
