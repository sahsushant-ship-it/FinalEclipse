package file;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.annotation.ElementType;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class demo5 {

	public static void main(String[] args) {
		Document d=new Document();
		
		try {
			FileOutputStream fos=new FileOutputStream("demo.pdf");
			PdfWriter.getInstance(d, fos);
			System.out.println("empty file created");
			d.open();
			Font f=new Font(FontFamily.COURIER,28,Font.ITALIC,BaseColor.GRAY);
			Paragraph p=new Paragraph("Welcome to JAVA",f);
			p.setAlignment(Element.ALIGN_CENTER);
			d.add(p);
			
			PdfPTable table = new 	PdfPTable(3);
			table.addCell("Name");
			table.addCell("gender");
			table.addCell("age");
			
			table.addCell("Basava");
			table.addCell("Male");
			table.addCell("25");
			
			d.add(table);
			
			
			d.close();
			System.out.println("File written");
		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


