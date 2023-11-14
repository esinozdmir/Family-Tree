
package familytree;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.apache.poi.poifs.property.Child;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FamilyTree {

    private static final String NAME = "C:\\Users\\90507\\OneDrive\\Resimler\\Prolab.xlsx";
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> id = new ArrayList<>();
        ArrayList<String> isim = new ArrayList<>();
        ArrayList<String> soyisim = new ArrayList<>();
        ArrayList<String> dogum_tarihi = new ArrayList<>();
        ArrayList<String> esi = new ArrayList<>();
        ArrayList<String> anne_adi = new ArrayList<>();
        ArrayList<String> baba_adi = new ArrayList<>();      
        ArrayList<String> kan_grubu = new ArrayList<>();
        ArrayList<String> meslek = new ArrayList<>();
        ArrayList<String> medeni_hali = new ArrayList<>();      
        ArrayList<String> kizlik_soy_ismi = new ArrayList<>();
        ArrayList<String> cinsiyet = new ArrayList<>();
        ArrayList<String> headers = new ArrayList<>();
        ArrayList<Person> personList = new ArrayList<>();    
        
        
        ArrayList<Person> kanList = new ArrayList<>();
        
    try{
        FileInputStream file = new FileInputStream(NAME);
        Workbook workbook = new XSSFWorkbook(file);
        DataFormatter dataFormatter = new DataFormatter();
        Iterator<Sheet> sheets=workbook.sheetIterator();
        
        while (sheets.hasNext()){
            Sheet sh =sheets.next();
            //System.out.println("Sheet name is "+sh.getSheetName());
            Iterator<Row> rowIterator =sh.iterator();
            
            while (rowIterator.hasNext()){
             
            Row row = rowIterator.next();         
            Iterator<Cell> cellIterator=row.iterator();
            
                while(cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                
                
                String cellValue =dataFormatter.formatCellValue(cell);
                   
                
                if(row.getRowNum()==0){
                            headers.add(cell.getStringCellValue());
                        }
                        else{
                            if (cell.getColumnIndex()==0) {
                              id.add(dataFormatter.formatCellValue(cell));
                            } 
                            else if(cell.getColumnIndex()==1){
                              isim.add(dataFormatter.formatCellValue(cell));
                            } 
                             else if(cell.getColumnIndex()==2){
                              soyisim.add(dataFormatter.formatCellValue(cell));
                            }
                             else if(cell.getColumnIndex()==3){
                              dogum_tarihi.add(dataFormatter.formatCellValue(cell));  
                            }
                             else if(cell.getColumnIndex()==4){
                              esi.add(dataFormatter.formatCellValue(cell)); 
                            } 
                             else if(cell.getColumnIndex()==5){
                              anne_adi.add(dataFormatter.formatCellValue(cell));
                            }
                             else if(cell.getColumnIndex()==6){
                              baba_adi.add(dataFormatter.formatCellValue(cell));
                            } 
                             else if(cell.getColumnIndex()==7){
                             // kan_grubu.add(dataFormatter.formatCellValue(cell));
                            }
                            else if(cell.getColumnIndex()==8){
                              kan_grubu.add(dataFormatter.formatCellValue(cell));
                            } 
                             else if(cell.getColumnIndex()==9){
                              medeni_hali.add(dataFormatter.formatCellValue(cell));
                            }
                             else if(cell.getColumnIndex()==10){
                              kizlik_soy_ismi.add(dataFormatter.formatCellValue(cell));
                            } 
                             else if(cell.getColumnIndex()==11){
                              cinsiyet.add(dataFormatter.formatCellValue(cell));
                            }
  
                        }
      
               // System.out.println(cellValue);
                
                 
                }

                //System.out.println();
                
            }
            
            
            }
        workbook.close();
            
    }
    catch (Exception e){
    
    e.printStackTrace();  
    }
    
   /* for(int i = 0; i < id.size(); i++)
                {
                    Person person=new Person();
                    person.setId(id.get(i));
                    person.setIsim(isim.get(i));
                    person.setSoyisim(soyisim.get(i));
                    person.setDogum_tarihi(dogum_tarihi.get(i));
                    person.setEsi(esi.get(i));
                    person.setAnne_adi(anne_adi.get(i));
                    person.setBaba_adi(baba_adi.get(i));
                    person.setKan_grubu(kan_grubu.get(i));
                    person.setMeslek(meslek.get(i));
                    person.setMedeni_hali(medeni_hali.get(i));
                    person.setKizlik_soy_ismi(kizlik_soy_ismi.get(i));
                    person.setCinsiyet(cinsiyet.get(i));
                    personList.add(person);
                }
    

            Person grand1=null;
            Person grand2=null;
                    
            List <Child> childList= new ArrayList<>();
            
            int personCount=0;
            int count=id.size();   
           
            while(count!=0)
            {
                if(count==personList.size() && cinsiyet.get(0).equals("Erkek"))
                {
                    grand1=personList.get(0);
                    grand1.setIsim(personList.get(0).getIsim());
                    
                    grand2=personList.get(1);
                    grand2.setIsim(personList.get(1).getIsim());
                    
                    count=count-2;
                    personCount=2;
                }
                
                else if(count==personList.size() && cinsiyet.get(0).equals("Kadın"))
                {
                    grand1=personList.get(1);
                    grand1.setIsim(personList.get(1).getIsim());
                    
                    grand2=personList.get(0);
                    grand2.setIsim(personList.get(0).getIsim());
                    
                    count=count-2;
                    personCount=2;
                }
                
                else
                {
                    if((personList.size()-count).cinsiyet.equals("Erkek"))
                    {
                        grand1=new Person;
                        grand2=new Person;
                        
                        grand1=personList.get(personCount);
                        grand2.setIsim(personList.get(personList.size()-count).getEsi());
                        
                        count--;
                        personCount++;
                    }
                    
                    else
                    {
                        grand1=new Person;
                        grand2=new Person;
                        
                        grand2=personList.get(personCount);
                        grand1.setIsim(personList.get(personList.size()-count).getEsi());
                        
                        count--;
                        personCount++;
                    }
                }
            }
           
            
            for (int i = personCount; i < personList.size(); i++) {
            
                if(personList.get(i).getBaba_adi().equals(grand1.getIsim()) && personList.get(i).getAnne_adi().equals(grand2.getIsim()))
                {
                    personList.get(i).setBaba_adi(grand1);
                    personList.get(i).setBaba_adi(grand2);
                    
                    if(null == grand1.getChildren())
                    {
                        List <Person>child1=new ArrayList();
                        grand1.setChildren(child1);
                    }
                    
                    if(null == grand2.getChildren())
                    {
                        List <Person>child2=new ArrayList();
                        grand2.setChildren(child2);
                    }
                    
                    List <Person> childListFather = grand1.getChildren();
                    childListFather.add(personList.get(i));
                    grand1.setChildren(childListFather);
                    
                    List <Person> childListMother = grand2.getChildren();
                    childListMother.add(personList.get(i));
                    grand2.setChildren(childListFather);
                }
                
                else if(personList.get(i).getBaba_adi().equals(grand1.getIsim()) && !personList.get(i).getAnne_adi().equals(grand2.getIsim()))
                {
                     personList.get(i).setBaba_adi(grand1);
                     
                     if(null == grand1.getChildren())
                    {
                        List <Person>child1=new ArrayList();
                        grand1.setChildren(child1);
                    }
                     
                     List <Person> childListFather = grand1.getChildren();
                     grand1.setChildren(childListFather);
                     
                     grand2.setChildren(childListFather);
                     //Üvey kardeşe ekle
                }
            
        }
            
            List <Person> noChildList = new ArrayList <Person>();
            
            for (int i = 0; i < personList.size(); i++) {
            if(null == personList.get(i).getChildren())
            {
                noChildList.add(personList.get(i));
            }
            }
                for (int i = 0; i < noChildList.size(); i++) {
                    
                    System.out.println(noChildList.get(i).getIsim());
                }
            
                
         public int getFatherParentID(Person p)
         {
             if(null!=p.getFather())
             {
                 return p.getFather().getId();
             }
             else
                 return 0;
         }
         
         public int getMotherParentID(Person p)
         {
             if(null!=p.getMother())
             {
                 return p.getMother().getId();
             }
             else
                 return 0;
         }
         
  */       
         
        
            
          System.out.println("3) A kan grubundakiler");
          for (int i = 0; i < id.size(); i++) {
              for (int j = 0; j < id.size(); j++) {
                  
              if(kan_grubu.get(i).equals("A(-)"))
              {
                  System.out.println(isim.get(i));
                  break;
              }
                  
              }
           
        }
            
         System.out.println("\n5)Soy ağacında aynı isme sahip kişilerin ismi ve yaşları ");    
         for (int i = 0; i < id.size(); i++) {
              for (int j = 0; j < id.size(); j++) {
                  
              if(isim.get(i).equals(isim.get(j+1)) )
                    {
                        if(!(dogum_tarihi.get(i).equals(dogum_tarihi.get(j+1))))
                        {
                            System.out.println(isim.get(i)+"\t"+dogum_tarihi.get(i)+"\t"+dogum_tarihi.get(j+1));
                            break;
                        }
                     break; 
                    }             
              }
        }
         
        

    
         
    }
    
    
}
