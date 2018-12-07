package rakesh.practice.programs.All_Mine;

	import java.io.FileOutputStream;

	import javax.print.DocFlavor;
	import javax.print.DocPrintJob;
	import javax.print.SimpleDoc;
	import javax.print.StreamPrintService;
	import javax.print.StreamPrintServiceFactory;
	import javax.print.attribute.HashPrintRequestAttributeSet;
	import javax.print.attribute.PrintRequestAttributeSet;
	import javax.print.attribute.standard.MediaSizeName;


	public class PDFToPS
	{

	    public static void main (String [] args)
	    {
	        /*try
	        {
	            DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
	            String psMimeType = DocFlavor.BYTE_ARRAY.POSTSCRIPT.getMimeType();
	            StreamPrintServiceFactory[] factories = StreamPrintServiceFactory.lookupStreamPrintServiceFactories(flavor, psMimeType);
	 
	            System.out.println ("Available PS services: " + factories.length);
	 
	            if(factories.length == 0)
	            {
	                System.err.println ("No PS factories available!");
	                System.exit(0);
	            }

	            // Open the PDF file
	            PDFPrint pdfPrint = new PDFPrint ("/Users/rgedam/Desktop/June-15.pdf", null);
	            
	            // Open the output file
	            FileOutputStream fos = new FileOutputStream("/Users/rgedam/Desktop/output.ps");
	 
	            // Use the first service available
	            StreamPrintService sps = factories[0].getPrintService(fos);
	            DocPrintJob pj = sps.createPrintJob();

	            // Define paper size
	            PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
	            aset.add(MediaSizeName.NA_LETTER);
	 
	            // Create simple doc using PDFPrint as Printable and print it
	            SimpleDoc doc = new SimpleDoc(pdfPrint, flavor, null);
	            pj.print(doc, aset);
	            
	            // Close the output PS stream
	            fos.close();
	        }
	        catch (Throwable t)
	        {
	            t.printStackTrace();
	        }*/
	    }
	}

