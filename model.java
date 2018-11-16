package com.example.aspire.baseexampleandroid;

public class model {
     public String getNo() {
          return no;
     }

     public void setNo(String no) {
          this.no = no;
     }

     public String getTxt() {
          return txt;
     }

     public void setTxt(String txt) {
          this.txt = txt;
     }

     String no;
      String txt;

     public model(String no,String txt) {
          this.no=no;
          this.txt=txt;
     }


}
