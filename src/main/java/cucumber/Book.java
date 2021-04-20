package cucumber;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Book {
	private Logger logger=Logger.getLogger(Book.class.getName());
	String auther;
	String title;
	String isbn;
	String signiture;
	String q="no book contain";
	String w ="in this title";
	String h;
	Book c;
	
	ArrayList  <Book> lib=new ArrayList<Book>();
	public Book()
	{
		
	}
	public Book(String author1,String title1,String isbn1 ,String sign)
	{
	auther =author1;
	title =title1;
	isbn=isbn1;
	signiture =sign;
	}
	public void bookSearchTitle(List<Book>lib,String subtit )
	{ 
		
		logger.log(Level.INFO,"\n");
		logger.log(Level.INFO,"when user searchs for one book by title:");
		for(Book d:lib)
		{ String tit=d.title; 
		  int f=tit.indexOf(subtit);
			if(f!=-1)
				c=d;
		}
		
	}
	public void bookSearchmoreTitle(List<Book>lib,String subtit )
	{ 
		
		logger.log(Level.INFO,"\n");
		logger.log(Level.INFO,"when user searchs for more than one book by title:");
		for(Book d:lib)
		{ String tit=d.title;
		  int f=tit.indexOf(subtit);
			if(f!=-1)
			{
				c=d;
				logger.log(Level.INFO,h);
			}
		}
	
	}
	public void bookSearchauthor(List<Book>lib,String author )
	{
		
		logger.log(Level.INFO,"when user searchs for one book by auther:");
		for(Book d:lib)
		{ String tit=d.auther;
		  int f=tit.indexOf(author);
			if(f!=-1)
				c=d;
		}
		if(c!=null)
			logger.log(Level.INFO,h);
		
	}
	public void bookSearchmoreauthor(List<Book>lib,String author )
	{ 
	
		logger.log(Level.INFO,"\n");
		logger.log(Level.INFO,"when user searchs for more than one book by author:");
		for(Book d:lib)
		{ String tit=d.auther;
		  int f=tit.indexOf(author);
			if(f!=-1)
				{c=d;
			
				logger.log(Level.INFO,h);
				}
		}
		
	}
	public void bookSearchISBN(List<Book>lib,String isbn )
	{

		logger.log(Level.INFO,"\n");
		logger.log(Level.INFO,"when user searchs for  one book by ISBN:");
		for(Book d:lib)
		{ String tit=d.isbn;
		  int f=tit.indexOf(isbn);
			if(f!=-1)
				c=d;
		}
		if(c!=null)
			logger.log(Level.INFO,h);
		
	}
	
	public void bookSearchmoreISBN(List<Book>lib,String isbn )
	{ 
		
		logger.log(Level.INFO,"\n");
		logger.log(Level.INFO,"when user searchs for more than one book by ISBN:");
		for(Book d:lib)
		{ String tit=d.isbn;
		  int f=tit.indexOf(isbn);
			if(f!=-1)
			{
				c=d;
				logger.log(Level.INFO,h);
			}
		}
		
	}

	
	public void addBook(List<Book>lib,Book b)
	{
		if(b.cheackISBN(b.isbn)&&b.checkSign(lib, b))
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
	public boolean checkSign(List<Book> lib2 ,Book a)
	{
		for(Book c1:lib2)
		{
		if(c1.signiture.equalsIgnoreCase(a.signiture))
			return false;
		}
		return true;
	}
	public void printBook(List<Book>b )
	{
		logger.log(Level.INFO,"\n");
		logger.log(Level.INFO,"the list of bookksin my library: ");
		for(Book c2:b)
		{
			String k=c2.title +" "+c2.isbn+" "+c2.signiture+" "+c2.auther+"\n";
			logger.log(Level.INFO,k);
		}
		
		
	}
}
