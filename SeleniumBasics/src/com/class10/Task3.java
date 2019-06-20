package com.class10;

public class Task3 {
	
	
public static void main(String[] args) {
	
	List<WebElement>row=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
    List<WebElement>col=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
    System.out.println(col.size());
    String name="Doe";
    
    for(int i=1;i<row.size();i++) {
        for(int a=1;a<col.size();a++) {
            String text=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+a+"]")).getText();
            System.out.println(text);
            if(text.contains(name)) {
                driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td/a[1]")).click();
                break;
            }
        }            
            
    }
}
}
