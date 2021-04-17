
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abdullah
 */
public class SlipGenerator {

    public ArrayList<Object> list = new ArrayList<>();

    public void generateStationarySlip() throws IOException {
        File file = new File("C:\\Users\\Abdullah\\OneDrive\\Desktop\\Mid term project\\ProcurementManagementSystem\\ProcurementManagementSystem\\slips\\StationeryReceipts.pdf");
        try (PDDocument doc = PDDocument.load(file)) {
            PDPage myPage = new PDPage();
            doc.addPage(myPage);

            try (PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {

                cont.beginText();

                cont.setFont(PDType1Font.TIMES_BOLD, 24);
                cont.setLeading(15.5);

                cont.newLineAtOffset(250, 700);
                cont.showText("~Receipt~");
                cont.newLine();
                cont.newLine();

                cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                cont.newLineAtOffset(-225, 0);

                System.out.println(list.get(0));
                cont.showText("- Name :" + list.get(0));
                cont.newLine();

                System.out.println(list.get(1));
                cont.showText("- Employee ID:" + list.get(1));
                cont.newLine();

                cont.newLine();
                cont.showText("Sr No.    Item Name               Quantity");
                cont.newLine();

                for (int i = 2; i < list.size(); i++) {
                    Accessories A;
                    A = (Accessories) list.get(i);
                    cont.showText(i - 1 + "            " + A.getItemName() + "               " + A.getQuantity());
                    cont.newLine();
                }

                cont.newLine();
                cont.showText("Date of issue : " + new Date().toString());
                cont.newLine();

                cont.newLine();
                cont.newLine();
                cont.showText("Signature of Employee :  ___________________");
                cont.newLine();
                cont.endText();
            }

            doc.save("C:\\Users\\Abdullah\\OneDrive\\Desktop\\Mid term project\\ProcurementManagementSystem\\ProcurementManagementSystem\\slips\\StationeryReceipts.pdf");
        }
    }

    public void generateLapTopSlip() throws IOException {
        File file = new File("C:\\Users\\Abdullah\\OneDrive\\Desktop\\Mid term project\\ProcurementManagementSystem\\ProcurementManagementSystem\\slips\\LaptopsReceipts.pdf");
        try (PDDocument doc = PDDocument.load(file)) {
            PDPage myPage = new PDPage();
            doc.addPage(myPage);

            try (PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {

                cont.beginText();

                cont.setFont(PDType1Font.TIMES_BOLD, 24);
                cont.setLeading(15.5);

                cont.newLineAtOffset(250, 700);
                cont.showText("~Receipt~");
                cont.newLine();
                cont.newLine();

                cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                cont.newLineAtOffset(-225, 0);

                System.out.println(list.get(0));
                cont.showText("- Name :" + list.get(0));
                cont.newLine();

                //System.out.println(list.get(1));
                cont.showText("- Employee ID:" + list.get(1));
                cont.newLine();

                cont.newLine();
                cont.setFont(PDType1Font.TIMES_BOLD, 14);
                cont.showText("Laptop Model        Processor Model     Generation");
                cont.newLine();

                Laptop L;
                L = (Laptop)list.get(2);
                cont.setFont(PDType1Font.TIMES_ROMAN, 12);
                cont.showText(L.getModel() + "                                 " + L.getProcessor() + "                          " + L.getGeneration());
                cont.newLine();

                cont.newLine();
                cont.showText("Date of Laptop issue : " + new Date().toString());
                cont.newLine();

                cont.newLine();
                cont.newLine();
                cont.showText("Signature of Employee :  ___________________");
                cont.newLine();
                cont.endText();
            }

            doc.save("C:\\Users\\Abdullah\\OneDrive\\Desktop\\Mid term project\\ProcurementManagementSystem\\ProcurementManagementSystem\\slips\\LaptopsReceipts.pdf");
        }
    }
}
