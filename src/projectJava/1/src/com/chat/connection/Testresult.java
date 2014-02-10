/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project Java.1.src.com.chat.connection;

import java.applet.Applet;

/**
 *
 * @author Euphern_Java
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Testresult extends Applet implements ActionListener, ItemListener{

	private TextField nametxt,ictxt,sextxt,dobtxt,agetxt,qdltxt,
	testdatetxt,orgtxt,trainertxt,occtxt,markertxt,ex1txt,ex2atxt,ex2btxt,ex3txt,ex4ctxt,ex4dtxt,
	ex5txt,ex6txt,ex7etxt,ex7ftxt,ex7gtxt,ex7htxt,ex7itxt,ex7jtxt,l28txt,l39txt,l45txt,l51txt;
	private Label namelbl,sexlbl,iclbl,doblbl,agelbl,qdllbl,testdatelbl,orglbl,trainerlbl,occlbl,markerlbl,
	ex1lbl,ex2albl,ex2blbl,ex3lbl,ex4clbl,ex4dlbl,ex5lbl,ex6lbl,ex7elbl,ex7flbl,ex7glbl,ex7hlbl,ex7ilbl
	,ex7jlbl,l28lbl,l39lbl,l45lbl,l51lbl;
	private Button submit;
	private Checkbox l28bx,l39bx,l45bx,l51bx;
	Panel p = new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Panel p4=new Panel();
	Panel p5=new Panel();
	Panel p6=new Panel();
	private String name,ic,qdl,org,trainer,occ,sex,marker,l28,l39,l45,l51;
	private int dob,age,testdate,ex1,ex2a,ex2b,ex3,ex4a,ex4b,ex5,ex6,ex7e,
	ex7f,ex7g,ex7h,ex7i,ex7j,score1,score2,score3,score4,score5,score6,score7e,
	score7f,score7g,score7h,score7i,score7j,score2minus3,score2minus3final,
	scorea,scoreb,scorec,scored,score7k,x1,x2,x3,x4,x5,x6,x2minus3final,
	x7e,x7f,x7g,x7h,x7i,x7j,total1and2,total1and2score;
	boolean check=false,l28click,l39click,l45click,l51click;


	public void init(){
		nametxt=new TextField (15);
		ictxt=new TextField (10);
		sextxt=new TextField(2);
		dobtxt=new TextField (9);
		agetxt=new TextField (3);
		qdltxt=new TextField (3);
		testdatetxt=new TextField (9);
		orgtxt=new TextField (15);
		trainertxt=new TextField (15);
		occtxt=new TextField(15);
		markertxt=new TextField(15);
		ex1txt=new TextField(2);
		ex2atxt=new TextField(2);
		ex2btxt=new TextField(2);
		ex3txt=new TextField(2);
		ex4ctxt=new TextField(2);
		ex4dtxt=new TextField(2);
		ex5txt=new TextField(2);
		ex6txt=new TextField(2);
		ex7etxt=new TextField(2);
		ex7ftxt=new TextField(2);
		ex7gtxt=new TextField(2);
		ex7htxt=new TextField(2);
		ex7itxt=new TextField(2);
		ex7jtxt=new TextField(2);
		l28txt=new TextField (2);
		l39txt=new TextField (2);
		l45txt=new TextField (2);
		l51txt=new TextField (2);

		namelbl=new Label ("Name");
		sexlbl=new Label ("Sex");
		iclbl=new Label ("NRIC");
		doblbl=new Label ("DOB(ddmmyyyy)");
		agelbl=new Label ("Age");
		qdllbl=new Label ("QDL");
		testdatelbl=new Label ("Test Date(ddmmyyyy)");
		orglbl=new Label ("Organization");
		trainerlbl=new Label ("Trainer");
		occlbl=new Label ("Occupation");
		markerlbl=new Label ("Marker");
		ex1lbl=new Label ("Exercise 1");
		ex2albl=new Label ("Exercise 2 Mistakes:");
		ex2blbl=new Label ("Exercise 2 Completed:");
		ex3lbl=new Label ("Exercise 3");
		ex4clbl=new Label ("Exercise 4 Mistakes");
		ex4dlbl=new Label ("Exercise 4 Completed");
		ex5lbl=new Label ("Exercise 5");
		ex6lbl=new Label ("Exercise 6");
		ex7elbl=new Label ("Exercise 7e");
		ex7flbl=new Label ("Exercise 7f");
		ex7glbl=new Label ("Exercise 7g");
		ex7hlbl=new Label ("Exercise 7h");
		ex7ilbl=new Label ("Exercise 7i");
		ex7jlbl=new Label ("Exercise 7j");
		l28lbl=new Label ("L28 (Y/N)");
		l39lbl=new Label ("L39 (Y/N)");
		l45lbl=new Label ("L45 (Y/N)");
		l51lbl=new Label ("L51 (Y/N)");

		l28bx=new Checkbox("L28");
		l39bx=new Checkbox("L39");
		l45bx=new Checkbox("L45");
		l51bx=new Checkbox("L51");
		submit=new Button ("Submit");

		submit.addActionListener(this); l28bx.addItemListener(this);l39bx.addItemListener(this);
		l45bx.addItemListener(this);l51bx.addItemListener(this);
		p.add(namelbl);p.add(nametxt);p.add(sexlbl);p.add(sextxt);p.add(iclbl);p.add(ictxt);
		p.add(doblbl);p.add(dobtxt);
		p2.add(testdatelbl);p2.add(testdatetxt);p2.add(orglbl);p2.add(orgtxt);
		p2.add(occlbl);p2.add(occtxt);
		p3.add(ex1lbl);p3.add(ex1txt);p3.add(ex2albl);p3.add(ex2atxt);p3.add(ex2blbl);
		p3.add(ex2btxt);p3.add(ex3lbl);p3.add(ex3txt);
		p4.add(trainerlbl);p4.add(trainertxt);p4.add(markerlbl);p4.add(markertxt);
		p4.add(qdllbl);p4.add(qdltxt);p4.add(agelbl);p4.add(agetxt);
		p5.add(ex7ilbl);p5.add(ex7itxt);
		p5.add(ex7jlbl);p5.add(ex7jtxt);p5.add(l28bx);p5.add(l39bx);
		p5.add(l45bx);p5.add(l51bx);add(p5);

		add(p);add(p2);add(p4);add(p3);
		add(ex4clbl);add(ex4ctxt);
		add(ex4dlbl);add(ex4dtxt);add(ex5lbl);add(ex5txt);add(ex6lbl);add(ex6txt);
		add(ex7elbl);add(ex7etxt);add(ex7flbl);add(ex7ftxt);add(ex7glbl);add(ex7gtxt);
		add(ex7hlbl);add(ex7htxt);
		add(p5);add(submit);
	}

	public void actionPerformed(ActionEvent e){

		if(e.getSource()==submit){
			ic=ictxt.getText();
			qdl=qdltxt.getText();
			sex=sextxt.getText();
			org=orgtxt.getText();
			occ=occtxt.getText();
			trainer=trainertxt.getText();
			name=nametxt.getText();
			dob=Integer.parseInt(dobtxt.getText());
			age=Integer.parseInt(agetxt.getText());
			testdate=Integer.parseInt(testdatetxt.getText());
			marker=markertxt.getText();
			ex1=Integer.parseInt(ex1txt.getText());
			ex2a=Integer.parseInt(ex2atxt.getText());
			ex2b=Integer.parseInt(ex2btxt.getText());
			ex3=Integer.parseInt(ex3txt.getText());
			ex4a=Integer.parseInt(ex4ctxt.getText());
			ex4b=Integer.parseInt(ex4dtxt.getText());
			ex5=Integer.parseInt(ex5txt.getText());
			ex6=Integer.parseInt(ex6txt.getText());
			ex7e=Integer.parseInt(ex7etxt.getText());
			ex7f=Integer.parseInt(ex7ftxt.getText());
			ex7g=Integer.parseInt(ex7gtxt.getText());
			ex7h=Integer.parseInt(ex7htxt.getText());
			ex7i=Integer.parseInt(ex7itxt.getText());
			ex7j=Integer.parseInt(ex7jtxt.getText());
			l28=l28txt.getText();
			l39=l28txt.getText();
			l45=l28txt.getText();
			l51=l28txt.getText();

			check=true;
		}
		repaint();

	}

	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==l28bx)
			l28click=l28bx.getState();
		if(e.getSource()==l39bx)
			l39click=l39bx.getState();
		if(e.getSource()==l45bx)
			l45click=l45bx.getState();
		if(e.getSource()==l51bx)
			l51click=l51bx.getState();
		}

	public void draw(Graphics g){
		g.setColor(Color.blue);
		g.setFont (new Font ("Sans Serif",Font.BOLD,20));
		g.drawString("",170,270);
		g.drawString("Driver Profile",175,290);



		/*g.drawString("Name: "+name,40,250);
		g.drawString("Sex: "+sex,250,250);
		g.drawString("NRIC: "+ic,350,250);
		g.drawString("DOB: "+dob,480,250);
		g.drawString("Age: "+age,40,270);
		g.drawString("QDL: "+qdl,100,270);
		g.drawString("Occupation: "+occ,200,270);
		g.drawString("Organization: "+org,450,270);
		g.drawString("Test Date: "+testdate,40,290);
		g.drawString("Trainer: "+trainer,150,290);
		g.drawString("Marker: "+marker,300,290);

		g.drawString("ex1: "+ex1,40,300);
		g.drawString("ex2a: "+ex2a,40,320);
		g.drawString("ex2b: "+ex2b,40,340);
		g.drawString("ex3: "+ex3,40,360);
		g.drawString("ex4c: "+ex4c,40,380);
		g.drawString("ex4d: "+ex4d,40,400);
		g.drawString("ex5: "+ex5,40,420);
		g.drawString("ex6: "+ex6,40,440);
		g.drawString("ex7e: "+ex7e,40,460);
		g.drawString("ex7f: "+ex7f,80,480);
		g.drawString("ex7g: "+ex7g,120,0);
		g.drawString("ex7h: "+ex7h,160,320);
		g.drawString("ex7i: "+ex7i,200,320);
		g.drawString("ex7j: "+ex7j,240,320);
		g.drawString("ex7k: "+ex7k,280,320);*/
	}

	public void finaloutput(Graphics g){
		/*g.drawString(""+score2,40,310);
		g.drawString(""+score4,40,320);
		g.drawString(""+score2minus3,40,340);
		g.drawString("Score A :"+scorea,40,400);
		g.drawString("Score B :"+scoreb,40,450);
		g.drawString("Score C :"+scorec,40,500);
		g.drawString("Score D :"+scored,40,550);
		g.drawString("Score E :"+score7e,40,600);
		g.drawString("Score F :"+score7f,40,650);
		g.drawString("Score G :"+score7g,40,700);
		g.drawString("Score H :"+score7h,40,750);
		g.drawString("Score I :"+score7i,40,800);
		g.drawString("Score J :"+score7j,40,850);
		g.drawString("Score K :"+score7k,40,900);
		g.drawString("Total No. of 1 & 2 : "+total1and2,40,920);
		g.drawString("Overall Score : "+total1and2score,40,350);*/

		g.drawString("NAME: "+name,40,350);
		g.drawString("NRIC: "+ic,40,400);
		g.drawString("DOB : "+dob,40,450);
		g.drawString("Age : "+age,40,500);
		g.drawString("Test Date : "+testdate,40,550);
		g.drawString("Org. :"+org,40,600);
		g.drawString("Trainer : "+trainer,40,650);
		g.drawString("Explained By :________________",40,850);
		g.drawString("Copyright 2011",40,900);
		g.drawString("",40,915);
		g.drawString("All Rights Reserved",40,930);
		g.drawString("",40,945);
	}

	public void calculate(){

		scorea=score1+score5;
		scoreb=score2+score4;
		scorec=score3+score6;
		scored=score2minus3final+score4;
		score7k=score7e+score7f+score7g+score7h+score7i+score7j;

	}


	public void caltotal1and2(){
		total1and2=x1+x2+x3+x4+x5+x6+x2minus3final+x7e+x7f+x7g+x7h+x7i+x7j;

		if(total1and2>=9)
			total1and2score=1;
		if((total1and2>=6)&&(total1and2<=8))
			total1and2score=2;
		if((total1and2>=3)&&(total1and2<=5))
			total1and2score=3;
		if((total1and2>=1)&&(total1and2<=2))
			total1and2score=4;
		if(total1and2==0)
			total1and2score=5;
	}

	public void det1and2(){
		if((score1<=2)&&(score1>=1))
			x1=1;
		else
			x1=0;
		if((score2<=2)&&(score2>=1))
			x2=1;
		else
			x2=0;
		if((score3<=2)&&(score2>=1))
			x3=1;
		else
			x3=0;
		if((score4<=2)&&(score4>=1))
			x4=2;
		else
			x4=0;
		if((score5<=2)&&(score5>=1))
			x5=1;
		else
			x5=0;
		if((score6<=2)&&(score6>=1))
			x6=1;
		else
			x6=0;
		if((score2minus3final<=2)&&(score2minus3final>=1))
			x2minus3final=1;
		else
			x2=0;
		if((score7e<=2)&&(score7e>=1))
			x7e=1;
		else
			x7e=0;
		if((score7f<=2)&&(score7f>=1))
			x7f=1;
		else
			x7f=0;
		if((score7g<=2)&&(score7g>=1))
			x7g=1;
		else
			x7g=0;
		if((score7h<=2)&&(score7h>=1))
			x7h=1;
		else
			x7h=0;
		if((score7i<=2)&&(score7i>=1))
			x7i=1;
		else
			x7i=0;
		if((score7j<=2)&&(score7j>=1))
			x7j=1;
		else
			x7j=0;
	}

	public void calscore2minus3(){
		score2minus3=score2-score3;
		if(score2minus3<=-2)
			score2minus3final=1;
		if(score2minus3==-1)
			score2minus3final=2;
		if(score2minus3==0)
			score2minus3final=4;
		if((score2minus3>=1)&&(score2minus3<=4))
			score2minus3final=5;
	}

	public void detMark19(){

		if(ex1<=24)					//ex1
			score1=1;
		if((ex1>24)&&(ex1<=28))
			score1=2;
		if((ex1>28)&&(ex1<=33))
			score1=3;
		if((ex1>33)&&(ex1<=39))
			score1=4;
		if((ex1>39)&&(ex1<=50))
			score1=5;

		if(ex3<=66)					//ex3
			score3=1;
		if((ex3>66)&&(ex3<=81))
			score3=2;
		if((ex3>81)&&(ex3<=95))
			score3=3;
		if((ex3>95)&&(ex3<=111))
			score3=4;
		if((ex3>=112))
			score3=5;

		if(ex5<=9)					//ex5
			score5=1;
		if((ex5>9)&&(ex5<=15))
			score5=2;
		if((ex5>15)&&(ex5<=20))
			score5=3;
		if((ex5>20)&&(ex5<=27))
			score5=4;
		if((ex5>27)&&(ex5<=35))
			score5=5;

		if(ex6<=38)					//ex6
			score6=1;
		if((ex6>38)&&(ex6<=45))
			score6=2;
		if((ex6>45)&&(ex6<=52))
			score6=3;
		if((ex6>52)&&(ex6<=59))
			score6=4;
		if((ex6>=60))
			score6=5;


		if(ex2b<=27){					//ex2
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=6))
				score2=3;
			if((ex2a>6)&&(ex2a<=10))
				score2=2;
			if((ex2a>10)&&(ex2a<=15))
				score2=1;
			if((ex2a>15)&&(ex2a<=21))
				score2=1;
			if((ex2a>21)&&(ex2a<=27))
				score2=1;
			if((ex2a>27)&&(ex2a<=35))
				score2=1;
			if((ex2a>35)&&(ex2a<=43))
				score2=1;
			if((ex2a>43)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=28)&&(ex2b<=33)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=10))
				score2=3;
			if((ex2a>10)&&(ex2a<=15))
				score2=1;
			if((ex2a>15)&&(ex2a<=21))
				score2=1;
			if((ex2a>21)&&(ex2a<=27))
				score2=1;
			if((ex2a>27)&&(ex2a<=35))
				score2=1;
			if((ex2a>35)&&(ex2a<=43))
				score2=1;
			if((ex2a>43)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=34)&&(ex2b<=42)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=10))
				score2=3;
			if((ex2a>10)&&(ex2a<=15))
				score2=2;
			if((ex2a>15)&&(ex2a<=21))
				score2=1;
			if((ex2a>21)&&(ex2a<=27))
				score2=1;
			if((ex2a>27)&&(ex2a<=35))
				score2=1;
			if((ex2a>35)&&(ex2a<=43))
				score2=1;
			if((ex2a>43)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=43)&&(ex2b<=50)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=10))
				score2=3;
			if((ex2a>10)&&(ex2a<=15))
				score2=3;
			if((ex2a>15)&&(ex2a<=21))
				score2=2;
			if((ex2a>21)&&(ex2a<=27))
				score2=1;
			if((ex2a>27)&&(ex2a<=35))
				score2=1;
			if((ex2a>35)&&(ex2a<=43))
				score2=1;
			if((ex2a>43)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=51)&&(ex2b<=60)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=10))
				score2=4;
			if((ex2a>10)&&(ex2a<=15))
				score2=3;
			if((ex2a>15)&&(ex2a<=21))
				score2=2;
			if((ex2a>21)&&(ex2a<=27))
				score2=1;
			if((ex2a>27)&&(ex2a<=35))
				score2=1;
			if((ex2a>35)&&(ex2a<=43))
				score2=1;
			if((ex2a>43)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=61)&&(ex2b<=70)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=10))
				score2=4;
			if((ex2a>10)&&(ex2a<=15))
				score2=3;
			if((ex2a>15)&&(ex2a<=21))
				score2=3;
			if((ex2a>21)&&(ex2a<=27))
				score2=2;
			if((ex2a>27)&&(ex2a<=35))
				score2=1;
			if((ex2a>35)&&(ex2a<=43))
				score2=1;
			if((ex2a>43)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=71)&&(ex2b<=80)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=10))
				score2=4;
			if((ex2a>10)&&(ex2a<=15))
				score2=4;
			if((ex2a>15)&&(ex2a<=21))
				score2=3;
			if((ex2a>21)&&(ex2a<=27))
				score2=2;
			if((ex2a>27)&&(ex2a<=35))
				score2=1;
			if((ex2a>35)&&(ex2a<=43))
				score2=1;
			if((ex2a>43)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}
		if((ex2b>=81)&&(ex2b<=92)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=10))
				score2=4;
			if((ex2a>10)&&(ex2a<=15))
				score2=4;
			if((ex2a>15)&&(ex2a<=21))
				score2=3;
			if((ex2a>21)&&(ex2a<=27))
				score2=3;
			if((ex2a>27)&&(ex2a<=35))
				score2=2;
			if((ex2a>35)&&(ex2a<=43))
				score2=1;
			if((ex2a>43)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=93)&&(ex2b<=106)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=10))
				score2=4;
			if((ex2a>10)&&(ex2a<=15))
				score2=4;
			if((ex2a>15)&&(ex2a<=21))
				score2=3;
			if((ex2a>21)&&(ex2a<=27))
				score2=3;
			if((ex2a>27)&&(ex2a<=35))
				score2=2;
			if((ex2a>35)&&(ex2a<=43))
				score2=2;
			if((ex2a>43)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=107)&&(ex2b<=119)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=10))
				score2=4;
			if((ex2a>10)&&(ex2a<=15))
				score2=4;
			if((ex2a>15)&&(ex2a<=21))
				score2=4;
			if((ex2a>21)&&(ex2a<=27))
				score2=3;
			if((ex2a>27)&&(ex2a<=35))
				score2=3;
			if((ex2a>35)&&(ex2a<=43))
				score2=2;
			if((ex2a>43)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=120)&&(ex2b<=135)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=10))
				score2=4;
			if((ex2a>10)&&(ex2a<=15))
				score2=4;
			if((ex2a>15)&&(ex2a<=21))
				score2=4;
			if((ex2a>21)&&(ex2a<=27))
				score2=3;
			if((ex2a>27)&&(ex2a<=35))
				score2=3;
			if((ex2a>35)&&(ex2a<=43))
				score2=2;
			if((ex2a>43)&&(ex2a<=51))
				score2=2;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=136)&&(ex2b<=140)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=10))
				score2=4;
			if((ex2a>10)&&(ex2a<=15))
				score2=4;
			if((ex2a>15)&&(ex2a<=21))
				score2=4;
			if((ex2a>21)&&(ex2a<=27))
				score2=3;
			if((ex2a>27)&&(ex2a<=35))
				score2=3;
			if((ex2a>35)&&(ex2a<=43))
				score2=3;
			if((ex2a>43)&&(ex2a<=51))
				score2=2;
			if(ex2a>51)
				score2=1;
		}

		if(ex4b<=252){				//ex4
			if(ex4a<=1)
				score4=4;
			if((ex4a>1)&&(ex4a<=3))
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if((ex4a>6)&&(ex4a<=7))
				score4=3;
			if(ex4a==8)
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=2;
			if((ex4a>12)&&(ex4a<=15))
				score4=2;
			if((ex4a>15)&&(ex4a<=19))
				score4=2;
			if((ex4a>19)&&(ex4a<=28))
				score4=1;
			if(ex4a>29)
				score4=1;
		}

		if((ex4b>=253)&&(ex4b<=279)){
			if(ex4a<=1)
				score4=4;
			if((ex4a>1)&&(ex4a<=3))
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if((ex4a>6)&&(ex4a<=7))
				score4=3;
			if(ex4a==8)
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=15))
				score4=2;
			if((ex4a>15)&&(ex4a<=19))
				score4=2;
			if((ex4a>19)&&(ex4a<=28))
				score4=1;
			if(ex4a>29)
				score4=1;
		}

		if((ex4b>=280)&&(ex4b<=297)){
			if(ex4a<=1)
				score4=4;
			if((ex4a>1)&&(ex4a<=3))
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if((ex4a>6)&&(ex4a<=7))
				score4=3;
			if(ex4a==8)
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=15))
				score4=2;
			if((ex4a>15)&&(ex4a<=19))
				score4=2;
			if((ex4a>19)&&(ex4a<=28))
				score4=1;
			if(ex4a>29)
				score4=1;
		}

		if((ex4b>=298)&&(ex4b<=310)){
			if(ex4a<=1)
				score4=4;
			if((ex4a>1)&&(ex4a<=3))
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if((ex4a>6)&&(ex4a<=7))
				score4=3;
			if(ex4a==8)
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=15))
				score4=2;
			if((ex4a>15)&&(ex4a<=19))
				score4=2;
			if((ex4a>19)&&(ex4a<=28))
				score4=2;
			if(ex4a>29)
				score4=1;
		}

		if((ex4b>=311)&&(ex4b<=323)){
			if(ex4a<=1)
				score4=4;
			if((ex4a>1)&&(ex4a<=3))
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if((ex4a>6)&&(ex4a<=7))
				score4=3;
			if(ex4a==8)
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=15))
				score4=2;
			if((ex4a>15)&&(ex4a<=19))
				score4=2;
			if((ex4a>19)&&(ex4a<=28))
				score4=2;
			if(ex4a>29)
				score4=1;
		}

		if((ex4b>=324)&&(ex4b<=334)){
			if(ex4a<=1)
				score4=4;
			if((ex4a>1)&&(ex4a<=3))
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if((ex4a>6)&&(ex4a<=7))
				score4=3;
			if(ex4a==8)
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=15))
				score4=2;
			if((ex4a>15)&&(ex4a<=19))
				score4=2;
			if((ex4a>19)&&(ex4a<=28))
				score4=2;
			if(ex4a>29)
				score4=1;
		}

		if((ex4b>=335)&&(ex4b<=347)){
			if(ex4a<=1)
				score4=4;
			if((ex4a>1)&&(ex4a<=3))
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if((ex4a>6)&&(ex4a<=7))
				score4=4;
			if(ex4a==8)
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=15))
				score4=2;
			if((ex4a>15)&&(ex4a<=19))
				score4=2;
			if((ex4a>19)&&(ex4a<=28))
				score4=2;
			if(ex4a>29)
				score4=1;
		}

		if((ex4b>=348)&&(ex4b<=360)){
			if(ex4a<=1)
				score4=5;
			if((ex4a>1)&&(ex4a<=3))
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if((ex4a>6)&&(ex4a<=7))
				score4=4;
			if(ex4a==8)
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=15))
				score4=3;
			if((ex4a>15)&&(ex4a<=19))
				score4=2;
			if((ex4a>19)&&(ex4a<=28))
				score4=2;
			if(ex4a>29)
				score4=1;
		}

		if((ex4b>=361)&&(ex4b<=382)){
			if(ex4a<=1)
				score4=5;
			if((ex4a>1)&&(ex4a<=3))
				score4=5;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if((ex4a>6)&&(ex4a<=7))
				score4=4;
			if(ex4a==8)
				score4=4;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=15))
				score4=3;
			if((ex4a>15)&&(ex4a<=19))
				score4=2;
			if((ex4a>19)&&(ex4a<=28))
				score4=2;
			if(ex4a>29)
				score4=1;
		}
		if((ex4b>=383)&&(ex4b<=419)){
			if(ex4a<=1)
				score4=5;
			if((ex4a>1)&&(ex4a<=3))
				score4=5;
			if((ex4a>3)&&(ex4a<=5))
				score4=5;
			if((ex4a>6)&&(ex4a<=7))
				score4=4;
			if(ex4a==8)
				score4=4;
			if((ex4a>8)&&(ex4a<=10))
				score4=4;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=15))
				score4=3;
			if((ex4a>15)&&(ex4a<=19))
				score4=3;
			if((ex4a>19)&&(ex4a<=28))
				score4=2;
			if(ex4a>29)
				score4=1;
		}
		if(ex4b>=420){
			if(ex4a<=1)
				score4=5;
			if((ex4a>1)&&(ex4a<=3))
				score4=5;
			if((ex4a>3)&&(ex4a<=5))
				score4=5;
			if((ex4a>6)&&(ex4a<=7))
				score4=5;
			if(ex4a==8)
				score4=5;
			if((ex4a>8)&&(ex4a<=10))
				score4=4;
			if((ex4a>10)&&(ex4a<=12))
				score4=4;
			if((ex4a>12)&&(ex4a<=15))
				score4=3;
			if((ex4a>15)&&(ex4a<=19))
				score4=3;
			if((ex4a>19)&&(ex4a<=28))
				score4=2;
			if(ex4a>29)
				score4=2;
		}

		if(ex7e<=3)				//ex7e
			score7e=1;
		if((ex7e>=4)&&(ex7e<=7))
			score7e=2;
		if((ex7e>=8)&&(ex7e<=11))
			score7e=3;
		if((ex7e>=12)&&(ex7e<=14))
			score7e=4;
		if(ex7e>=15)
			score7e=5;

		if(ex7f<=3)				//ex7f
			score7f=1;
		if((ex7f>=4)&&(ex7f<=6))
			score7f=2;
		if((ex7f>=7)&&(ex7f<=10))
			score7f=3;
		if((ex7f>=11)&&(ex7f<=13))
			score7f=4;
		if(ex7f>=14)
			score7f=5;

		if(ex7g<=2)				//ex7g
			score7g=1;
		if((ex7g>=3)&&(ex7g<=4))
			score7g=2;
		if((ex7g>=5)&&(ex7g<=8))
			score7g=3;
		if((ex7g>=9)&&(ex7g<=12))
			score7g=4;
		if(ex7g>=13)
			score7g=5;

		if(ex7h<=3)				//ex7h
			score7h=1;
		if((ex7h>=4)&&(ex7h<=6))
			score7h=2;
		if((ex7h>=7)&&(ex7h<=10))
			score7h=3;
		if((ex7h>=11)&&(ex7h<=13))
			score7h=4;
		if(ex7h>=14)
			score7h=5;

		if(ex7i<=4)				//ex7i
			score7i=1;
		if((ex7i>=5)&&(ex7i<=7))
			score7i=2;
		if((ex7i>=8)&&(ex7i<=10))
			score7i=3;
		if((ex7i>=11)&&(ex7i<=13))
			score7i=4;
		if(ex7i>=14)
			score7i=5;

		if(ex7j<=5)				//ex7j
			score7j=1;
		if((ex7j==6))
			score7j=2;
		if((ex7j>=7)&&(ex7j<=8))
			score7j=3;
		if((ex7j>=9)&&(ex7j<=10))
			score7j=4;

	}
	public void detMark29(){

		if(ex1<=22)					//ex1
			score1=1;
		if((ex1>22)&&(ex1<=27))
			score1=2;
		if((ex1>27)&&(ex1<=33))
			score1=3;
		if((ex1>33)&&(ex1<=39))
			score1=4;
		if((ex1>39)&&(ex1<=50))
			score1=5;

		if(ex3<=66)					//ex3
			score3=1;
		if((ex3>66)&&(ex3<=81))
			score3=2;
		if((ex3>81)&&(ex3<=95))
			score3=3;
		if((ex3>95)&&(ex3<=111))
			score3=4;
		if((ex3>=112))
			score3=5;

		if(ex5<=9)					//ex5
			score5=1;
		if((ex5>9)&&(ex5<=16))
			score5=2;
		if((ex5>16)&&(ex5<=23))
			score5=3;
		if((ex5>23)&&(ex5<=30))
			score5=4;
		if((ex5>30)&&(ex5<=35))
			score5=5;

		if(ex6<=37)					//ex6
			score6=1;
		if((ex6>37)&&(ex6<=45))
			score6=2;
		if((ex6>45)&&(ex6<=53))
			score6=3;
		if((ex6>53)&&(ex6<=60))
			score6=4;
		if((ex6>=61))
			score6=5;


		if(ex2b<=24){					//ex2
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=6))
				score2=3;
			if((ex2a>6)&&(ex2a<=9))
				score2=2;
			if((ex2a>9)&&(ex2a<=14))
				score2=1;
			if((ex2a>15)&&(ex2a<=19))
				score2=1;
			if((ex2a>19)&&(ex2a<=25))
				score2=1;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=25)&&(ex2b<=30)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=6))
				score2=3;
			if((ex2a>6)&&(ex2a<=9))
				score2=2;
			if((ex2a>9)&&(ex2a<=14))
				score2=1;
			if((ex2a>14)&&(ex2a<=19))
				score2=1;
			if((ex2a>20)&&(ex2a<=25))
				score2=1;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=31)&&(ex2b<=39)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=3;
			if((ex2a>9)&&(ex2a<=14))
				score2=2;
			if((ex2a>14)&&(ex2a<=19))
				score2=1;
			if((ex2a>19)&&(ex2a<=25))
				score2=1;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=40)&&(ex2b<=47)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=3;
			if((ex2a>9)&&(ex2a<=14))
				score2=3;
			if((ex2a>14)&&(ex2a<=19))
				score2=2;
			if((ex2a>19)&&(ex2a<=25))
				score2=1;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=48)&&(ex2b<=56)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=3;
			if((ex2a>9)&&(ex2a<=14))
				score2=3;
			if((ex2a>14)&&(ex2a<=19))
				score2=2;
			if((ex2a>19)&&(ex2a<=25))
				score2=1;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=57)&&(ex2b<=66)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=3;
			if((ex2a>14)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=25))
				score2=2;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=67)&&(ex2b<=77)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=3;
			if((ex2a>14)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=25))
				score2=2;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}
		if((ex2b>=78)&&(ex2b<=90)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=25))
				score2=3;
			if((ex2a>25)&&(ex2a<=32))
				score2=2;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=91)&&(ex2b<=104)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=25))
				score2=3;
			if((ex2a>25)&&(ex2a<=32))
				score2=2;
			if((ex2a>32)&&(ex2a<=41))
				score2=2;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=105)&&(ex2b<=119)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=25))
				score2=3;
			if((ex2a>25)&&(ex2a<=32))
				score2=3;
			if((ex2a>32)&&(ex2a<=41))
				score2=2;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=120)&&(ex2b<=135)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=4;
			if((ex2a>19)&&(ex2a<=25))
				score2=3;
			if((ex2a>25)&&(ex2a<=32))
				score2=3;
			if((ex2a>32)&&(ex2a<=41))
				score2=2;
			if((ex2a>41)&&(ex2a<=51))
				score2=2;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=136)&&(ex2b<=140)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=9))
				score2=5;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=4;
			if((ex2a>19)&&(ex2a<=25))
				score2=3;
			if((ex2a>25)&&(ex2a<=32))
				score2=3;
			if((ex2a>32)&&(ex2a<=41))
				score2=3;
			if((ex2a>41)&&(ex2a<=51))
				score2=2;
			if(ex2a>51)
				score2=1;
		}

		if(ex4b<=255){				//ex4
			if(ex4a<=0)
				score4=4;
			if((ex4a>0)&&(ex4a<=2))
				score4=4;
			if(ex4a==3)
				score4=3;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=2;
			if((ex4a>10)&&(ex4a<=12))
				score4=2;
			if((ex4a>12)&&(ex4a<=16))
				score4=2;
			if((ex4a>16)&&(ex4a<=25))
				score4=1;
			if(ex4a>25)
				score4=1;
		}

		if((ex4b>=256)&&(ex4b<=285)){
			if(ex4a<=0)
				score4=4;
			if((ex4a>0)&&(ex4a<=2))
				score4=4;
			if(ex4a==3)
				score4=3;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=2;
			if((ex4a>10)&&(ex4a<=12))
				score4=2;
			if((ex4a>12)&&(ex4a<=16))
				score4=2;
			if((ex4a>16)&&(ex4a<=25))
				score4=1;
			if(ex4a>25)
				score4=1;
		}

		if((ex4b>=286)&&(ex4b<=304)){
			if(ex4a<=0)
				score4=4;
			if((ex4a>0)&&(ex4a<=2))
				score4=4;
			if(ex4a==3)
				score4=3;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=2;
			if((ex4a>12)&&(ex4a<=16))
				score4=2;
			if((ex4a>16)&&(ex4a<=25))
				score4=1;
			if(ex4a>25)
				score4=1;
		}

		if((ex4b>=305)&&(ex4b<=318)){
			if(ex4a<=0)
				score4=4;
			if((ex4a>0)&&(ex4a<=2))
				score4=4;
			if(ex4a==3)
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=2;
			if((ex4a>12)&&(ex4a<=16))
				score4=2;
			if((ex4a>16)&&(ex4a<=25))
				score4=2;
			if(ex4a>25)
				score4=1;
		}

		if((ex4b>=319)&&(ex4b<=330)){
			if(ex4a<=0)
				score4=4;
			if((ex4a>0)&&(ex4a<=2))
				score4=4;
			if(ex4a==3)
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=2;
			if((ex4a>12)&&(ex4a<=16))
				score4=2;
			if((ex4a>16)&&(ex4a<=25))
				score4=2;
			if(ex4a>25)
				score4=1;
		}

		if((ex4b>=331)&&(ex4b<=343)){
			if(ex4a<=0)
				score4=4;
			if((ex4a>0)&&(ex4a<=2))
				score4=4;
			if(ex4a==3)
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=2;
			if((ex4a>12)&&(ex4a<=16))
				score4=2;
			if((ex4a>16)&&(ex4a<=25))
				score4=2;
			if(ex4a>25)
				score4=1;
		}

		if((ex4b>=344)&&(ex4b<=359)){
			if(ex4a<=0)
				score4=4;
			if((ex4a>0)&&(ex4a<=2))
				score4=4;
			if(ex4a==3)
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=2;
			if((ex4a>12)&&(ex4a<=16))
				score4=2;
			if((ex4a>16)&&(ex4a<=25))
				score4=2;
			if(ex4a>25)
				score4=1;
		}

		if((ex4b>=360)&&(ex4b<=374)){
			if(ex4a<=0)
				score4=5;
			if((ex4a>0)&&(ex4a<=2))
				score4=4;
			if(ex4a==3)
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=16))
				score4=2;
			if((ex4a>16)&&(ex4a<=25))
				score4=2;
			if(ex4a>25)
				score4=1;
		}

		if((ex4b>=375)&&(ex4b<=395)){
			if(ex4a<=0)
				score4=5;
			if((ex4a>0)&&(ex4a<=2))
				score4=5;
			if(ex4a==3)
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if(ex4a==6)
				score4=4;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=16))
				score4=2;
			if((ex4a>16)&&(ex4a<=25))
				score4=2;
			if(ex4a>25)
				score4=1;
		}
		if((ex4b>=396)&&(ex4b<=431)){
			if(ex4a<=0)
				score4=5;
			if((ex4a>0)&&(ex4a<=2))
				score4=5;
			if(ex4a==3)
				score4=5;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if(ex4a==6)
				score4=4;
			if((ex4a>6)&&(ex4a<=8))
				score4=4;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=16))
				score4=2;
			if((ex4a>16)&&(ex4a<=25))
				score4=2;
			if(ex4a>25)
				score4=1;
		}
		if(ex4b>=432){
			if(ex4a<=0)
				score4=5;
			if((ex4a>0)&&(ex4a<=2))
				score4=5;
			if(ex4a==3)
				score4=5;
			if((ex4a>3)&&(ex4a<5))
				score4=5;
			if(ex4a==6)
				score4=5;
			if((ex4a>6)&&(ex4a<=8))
				score4=5;
			if((ex4a>8)&&(ex4a<=10))
				score4=4;
			if((ex4a>10)&&(ex4a<=12))
				score4=3;
			if((ex4a>12)&&(ex4a<=16))
				score4=3;
			if((ex4a>16)&&(ex4a<=25))
				score4=2;
			if(ex4a>26)
				score4=2;
		}

		if(ex7e<=3)				//ex7e
			score7e=1;
		if((ex7e>=4)&&(ex7e<=7))
			score7e=2;
		if((ex7e>=8)&&(ex7e<=11))
			score7e=3;
		if((ex7e>=12)&&(ex7e<=14))
			score7e=4;
		if(ex7e>=15)
			score7e=5;

		if(ex7f<=3)				//ex7f
			score7f=1;
		if((ex7f>=4)&&(ex7f<=6))
			score7f=2;
		if((ex7f>=7)&&(ex7f<=10))
			score7f=3;
		if((ex7f>=11)&&(ex7f<=14))
			score7f=4;
		if(ex7f>=15)
			score7f=5;

		if(ex7g<=2)				//ex7g
			score7g=1;
		if((ex7g>=3)&&(ex7g<=5))
			score7g=2;
		if((ex7g>=6)&&(ex7g<=9))
			score7g=3;
		if((ex7g>=10)&&(ex7g<=12))
			score7g=4;
		if(ex7g>=13)
			score7g=5;

		if(ex7h<=2)				//ex7h
			score7h=1;
		if((ex7h>=3)&&(ex7h<=6))
			score7h=2;
		if((ex7h>=7)&&(ex7h<=9))
			score7h=3;
		if((ex7h>=10)&&(ex7h<=13))
			score7h=4;
		if(ex7h>=14)
			score7h=5;

		if(ex7i<=4)				//ex7i
			score7i=1;
		if((ex7i>=5)&&(ex7i<=8))
			score7i=2;
		if((ex7i>=9)&&(ex7i<=11))
			score7i=3;
		if((ex7i>=12)&&(ex7i<=14))
			score7i=4;
		if(ex7i>=15)
			score7i=5;

		if(ex7j<=4)				//ex7j
			score7j=1;
		if((ex7j>=5)&&(ex7j<=6))
			score7j=2;
		if((ex7j>=7)&&(ex7j<=8))
			score7j=3;
		if(ex7j==9)
			score7j=4;
		if(ex7j==10)
			score7j=5;

	}

	public void detMark39(){

		if(ex1<=18)					//ex1
			score1=1;
		if((ex1>18)&&(ex1<=23))
			score1=2;
		if((ex1>23)&&(ex1<=28))
			score1=3;
		if((ex1>28)&&(ex1<=34))
			score1=4;
		if((ex1>34)&&(ex1<=50))
			score1=5;

		if(ex3<=57)					//ex3
			score3=1;
		if((ex3>57)&&(ex3<=73))
			score3=2;
		if((ex3>73)&&(ex3<=88))
			score3=3;
		if((ex3>88)&&(ex3<=102))
			score3=4;
		if((ex3>=103))
			score3=5;

		if(ex5<=7)					//ex5
			score5=1;
		if((ex5>7)&&(ex5<=13))
			score5=2;
		if((ex5>13)&&(ex5<=20))
			score5=3;
		if((ex5>20)&&(ex5<=27))
			score5=4;
		if((ex5>=27)&&(ex5<=35))
			score5=5;

		if(ex6<=31)					//ex6
			score6=1;
		if((ex6>31)&&(ex6<=40))
			score6=2;
		if((ex6>40)&&(ex6<=48))
			score6=3;
		if((ex6>48)&&(ex6<=56))
			score6=4;
		if((ex6>=57))
			score6=5;


		if(ex2b<=23){					//ex2
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=6))
				score2=3;
			if((ex2a>6)&&(ex2a<=9))
				score2=2;
			if((ex2a>9)&&(ex2a<=14))
				score2=1;
			if((ex2a>15)&&(ex2a<=19))
				score2=1;
			if((ex2a>19)&&(ex2a<=25))
				score2=1;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=24)&&(ex2b<=29)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=6))
				score2=3;
			if((ex2a>6)&&(ex2a<=9))
				score2=3;
			if((ex2a>9)&&(ex2a<=14))
				score2=1;
			if((ex2a>14)&&(ex2a<=19))
				score2=1;
			if((ex2a>20)&&(ex2a<=25))
				score2=1;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=30)&&(ex2b<=34)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=3;
			if((ex2a>9)&&(ex2a<=14))
				score2=2;
			if((ex2a>14)&&(ex2a<=19))
				score2=1;
			if((ex2a>19)&&(ex2a<=25))
				score2=1;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=35)&&(ex2b<=44)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=3;
			if((ex2a>9)&&(ex2a<=14))
				score2=3;
			if((ex2a>14)&&(ex2a<=19))
				score2=1;
			if((ex2a>19)&&(ex2a<=25))
				score2=1;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=45)&&(ex2b<=52)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=3;
			if((ex2a>14)&&(ex2a<=19))
				score2=2;
			if((ex2a>19)&&(ex2a<=25))
				score2=1;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=53)&&(ex2b<=61)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=3;
			if((ex2a>14)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=25))
				score2=2;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=62)&&(ex2b<=72)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=25))
				score2=2;
			if((ex2a>25)&&(ex2a<=32))
				score2=1;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}
		if((ex2b>=73)&&(ex2b<=85)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=4;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=25))
				score2=3;
			if((ex2a>25)&&(ex2a<=32))
				score2=2;
			if((ex2a>32)&&(ex2a<=41))
				score2=1;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=86)&&(ex2b<=98)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=25))
				score2=3;
			if((ex2a>25)&&(ex2a<=32))
				score2=2;
			if((ex2a>32)&&(ex2a<=41))
				score2=2;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=99)&&(ex2b<=111)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=4;
			if((ex2a>19)&&(ex2a<=25))
				score2=3;
			if((ex2a>25)&&(ex2a<=32))
				score2=3;
			if((ex2a>32)&&(ex2a<=41))
				score2=2;
			if((ex2a>41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=112)&&(ex2b<=135)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=9))
				score2=4;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=4;
			if((ex2a>19)&&(ex2a<=25))
				score2=3;
			if((ex2a>25)&&(ex2a<=32))
				score2=3;
			if((ex2a>32)&&(ex2a<=41))
				score2=3;
			if((ex2a>41)&&(ex2a<=51))
				score2=2;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=136)&&(ex2b<=140)){
			if(ex2a<=1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=6))
				score2=5;
			if((ex2a>6)&&(ex2a<=9))
				score2=5;
			if((ex2a>9)&&(ex2a<=14))
				score2=4;
			if((ex2a>14)&&(ex2a<=19))
				score2=4;
			if((ex2a>19)&&(ex2a<=25))
				score2=4;
			if((ex2a>25)&&(ex2a<=32))
				score2=3;
			if((ex2a>32)&&(ex2a<=41))
				score2=3;
			if((ex2a>41)&&(ex2a<=51))
				score2=2;
			if(ex2a>51)
				score2=1;
		}

		if(ex4b<=240){				//ex4
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=10))
				score4=2;
			if((ex4a>10)&&(ex4a<=13))
				score4=2;
			if((ex4a>13)&&(ex4a<=22))
				score4=1;
			if(ex4a>22)
				score4=1;
		}

		if((ex4b>=241)&&(ex4b<=269)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=10))
				score4=2;
			if((ex4a>10)&&(ex4a<=13))
				score4=2;
			if((ex4a>13)&&(ex4a<=22))
				score4=1;
			if(ex4a>22)
				score4=1;
		}

		if((ex4b>=270)&&(ex4b<=291)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=2;
			if((ex4a>10)&&(ex4a<=13))
				score4=2;
			if((ex4a>13)&&(ex4a<=22))
				score4=1;
			if(ex4a>22)
				score4=1;
		}

		if((ex4b>=292)&&(ex4b<=306)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=3;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=2;
			if((ex4a>10)&&(ex4a<=13))
				score4=2;
			if((ex4a>13)&&(ex4a<=22))
				score4=2;
			if(ex4a>22)
				score4=1;
		}

		if((ex4b>=307)&&(ex4b<=319)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=3;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=2;
			if((ex4a>10)&&(ex4a<=13))
				score4=2;
			if((ex4a>13)&&(ex4a<=22))
				score4=2;
			if(ex4a>22)
				score4=1;
		}

		if((ex4b>=320)&&(ex4b<=330)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=3;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=2;
			if((ex4a>10)&&(ex4a<=13))
				score4=2;
			if((ex4a>13)&&(ex4a<=22))
				score4=2;
			if(ex4a>22)
				score4=1;
		}

		if((ex4b>=331)&&(ex4b<=345)){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=2;
			if((ex4a>10)&&(ex4a<=13))
				score4=2;
			if((ex4a>13)&&(ex4a<=22))
				score4=2;
			if(ex4a>22)
				score4=1;
		}

		if((ex4b>=346)&&(ex4b<=359)){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=13))
				score4=2;
			if((ex4a>13)&&(ex4a<=22))
				score4=2;
			if(ex4a>22)
				score4=1;
		}

		if((ex4b>=360)&&(ex4b<=380)){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=5;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=13))
				score4=2;
			if((ex4a>13)&&(ex4a<=22))
				score4=2;
			if(ex4a>22)
				score4=1;
		}

		if((ex4b>=381)&&(ex4b<=419)){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=5;
			if(ex4a==2)
				score4=5;
			if(ex4a==3)
				score4=4;
			if((ex4a>3)&&(ex4a<=5))
				score4=4;
			if(ex4a==6)
				score4=4;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=13))
				score4=2;
			if((ex4a>13)&&(ex4a<=22))
				score4=2;
			if(ex4a>22)
				score4=1;
		}

		if(ex4b>=420){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=5;
			if(ex4a==2)
				score4=5;
			if(ex4a==3)
				score4=5;
			if((ex4a>3)&&(ex4a<=5))
				score4=5;
			if(ex4a==6)
				score4=5;
			if((ex4a>6)&&(ex4a<=8))
				score4=4;
			if((ex4a>8)&&(ex4a<=10))
				score4=3;
			if((ex4a>10)&&(ex4a<=13))
				score4=3;
			if((ex4a>13)&&(ex4a<=22))
				score4=2;
			if(ex4a>22)
				score4=2;
		}

		if(ex7e<=3)				//ex7e
			score7e=1;
		if((ex7e>=4)&&(ex7e<=6))
			score7e=2;
		if((ex7e>=7)&&(ex7e<=10))
			score7e=3;
		if((ex7e>=11)&&(ex7e<=13))
			score7e=4;
		if(ex7e>=14)
			score7e=5;

		if(ex7f<=4)				//ex7f
			score7f=1;
		if((ex7f>=5)&&(ex7f<=7))
			score7f=2;
		if((ex7f>=8)&&(ex7f<=11))
			score7f=3;
		if((ex7f>=12)&&(ex7f<=14))
			score7f=4;
		if(ex7f>=15)
			score7f=5;

		if(ex7g<=2)				//ex7g
			score7g=1;
		if((ex7g>=3)&&(ex7g<=6))
			score7g=2;
		if((ex7g>=7)&&(ex7g<=9))
			score7g=3;
		if((ex7g>=10)&&(ex7g<=13))
			score7g=4;
		if(ex7g>=14)
			score7g=5;

		if(ex7h<=2)				//ex7h
			score7h=1;
		if((ex7h>=3)&&(ex7h<=6))
			score7h=2;
		if((ex7h>=7)&&(ex7h<=9))
			score7h=3;
		if((ex7h>=10)&&(ex7h<=13))
			score7h=4;
		if(ex7h>=14)
			score7h=5;

		if(ex7i<=5)				//ex7i
			score7i=1;
		if((ex7i>=6)&&(ex7i<=8))
			score7i=2;
		if((ex7i>=9)&&(ex7i<=12))
			score7i=3;
		if((ex7i>=13)&&(ex7i<=14))
			score7i=4;
		if(ex7i>=15)
			score7i=5;

		if(ex7j<=3)				//ex7j
			score7j=1;
		if((ex7j>=4)&&(ex7j<=5))
			score7j=2;
		if((ex7j>=6)&&(ex7j<=7))
			score7j=3;
		if((ex7j>=8)&&(ex7j<=9))
			score7j=4;
		if(ex7j==10)
			score7j=5;

	}

	public void detMark49(){

		if(ex1<=14)					//ex1
			score1=1;
		if((ex1>14)&&(ex1<=21))
			score1=2;
		if((ex1>21)&&(ex1<=26))
			score1=3;
		if((ex1>26)&&(ex1<=32))
			score1=4;
		if((ex1>32)&&(ex1<=50))
			score1=5;

		if(ex3<=50)					//ex3
			score3=1;
		if((ex3>50)&&(ex3<=67))
			score3=2;
		if((ex3>67)&&(ex3<=83))
			score3=3;
		if((ex3>83)&&(ex3<=98))
			score3=4;
		if((ex3>=99))
			score3=5;

		if(ex5<=7)					//ex5
			score5=1;
		if((ex5>7)&&(ex5<=13))
			score5=2;
		if((ex5>13)&&(ex5<=19))
			score5=3;
		if((ex5>19)&&(ex5<=25))
			score5=4;
		if((ex5>=25)&&(ex5<=35))
			score5=5;

		if(ex6<=28)					//ex6
			score6=1;
		if((ex6>28)&&(ex6<=37))
			score6=2;
		if((ex6>37)&&(ex6<=46))
			score6=3;
		if((ex6>46)&&(ex6<=54))
			score6=4;
		if((ex6>=55))
			score6=5;


		if(ex2b<=20){					//ex2
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=5))
				score2=3;
			if((ex2a>5)&&(ex2a<=8))
				score2=2;
			if((ex2a>8)&&(ex2a<=13))
				score2=1;
			if((ex2a>13)&&(ex2a<=19))
				score2=1;
			if((ex2a>19)&&(ex2a<=24))
				score2=1;
			if((ex2a>24)&&(ex2a<=31))
				score2=1;
			if((ex2a>31)&&(ex2a<=40))
				score2=1;
			if((ex2a>=41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=21)&&(ex2b<=28)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=5))
				score2=3;
			if((ex2a>5)&&(ex2a<=8))
				score2=3;
			if((ex2a>8)&&(ex2a<=13))
				score2=1;
			if((ex2a>13)&&(ex2a<=19))
				score2=1;
			if((ex2a>19)&&(ex2a<=24))
				score2=1;
			if((ex2a>24)&&(ex2a<=31))
				score2=1;
			if((ex2a>31)&&(ex2a<=40))
				score2=1;
			if((ex2a>=41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=29)&&(ex2b<=34)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=3;
			if((ex2a>8)&&(ex2a<=13))
				score2=2;
			if((ex2a>13)&&(ex2a<=19))
				score2=1;
			if((ex2a>19)&&(ex2a<=24))
				score2=1;
			if((ex2a>24)&&(ex2a<=31))
				score2=1;
			if((ex2a>31)&&(ex2a<=40))
				score2=1;
			if((ex2a>=41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=35)&&(ex2b<=42)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=3;
			if((ex2a>8)&&(ex2a<=13))
				score2=3;
			if((ex2a>13)&&(ex2a<=19))
				score2=2;
			if((ex2a>19)&&(ex2a<=24))
				score2=1;
			if((ex2a>24)&&(ex2a<=31))
				score2=1;
			if((ex2a>31)&&(ex2a<=40))
				score2=1;
			if((ex2a>=41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=43)&&(ex2b<=50)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=13))
				score2=3;
			if((ex2a>13)&&(ex2a<=19))
				score2=2;
			if((ex2a>19)&&(ex2a<=24))
				score2=1;
			if((ex2a>24)&&(ex2a<=31))
				score2=1;
			if((ex2a>31)&&(ex2a<=40))
				score2=1;
			if((ex2a>=41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=51)&&(ex2b<=59)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=13))
				score2=3;
			if((ex2a>13)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=24))
				score2=2;
			if((ex2a>24)&&(ex2a<=31))
				score2=1;
			if((ex2a>31)&&(ex2a<=40))
				score2=1;
			if((ex2a>=41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=60)&&(ex2b<=70)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=13))
				score2=4;
			if((ex2a>13)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=24))
				score2=2;
			if((ex2a>24)&&(ex2a<=31))
				score2=2;
			if((ex2a>31)&&(ex2a<=40))
				score2=1;
			if((ex2a>=41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=71)&&(ex2b<=82)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=5;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=13))
				score2=4;
			if((ex2a>13)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=24))
				score2=3;
			if((ex2a>24)&&(ex2a<=31))
				score2=2;
			if((ex2a>31)&&(ex2a<=40))
				score2=1;
			if((ex2a>=41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=83)&&(ex2b<=95)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=5;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=13))
				score2=4;
			if((ex2a>13)&&(ex2a<=19))
				score2=3;
			if((ex2a>19)&&(ex2a<=24))
				score2=3;
			if((ex2a>24)&&(ex2a<=31))
				score2=2;
			if((ex2a>31)&&(ex2a<=40))
				score2=2;
			if((ex2a>=41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=96)&&(ex2b<=111)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=5;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=13))
				score2=4;
			if((ex2a>13)&&(ex2a<=19))
				score2=4;
			if((ex2a>19)&&(ex2a<=24))
				score2=3;
			if((ex2a>24)&&(ex2a<=31))
				score2=3;
			if((ex2a>31)&&(ex2a<=40))
				score2=2;
			if((ex2a>=41)&&(ex2a<=51))
				score2=1;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=112)&&(ex2b<=126)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=5;
			if((ex2a>5)&&(ex2a<=8))
				score2=5;
			if((ex2a>8)&&(ex2a<=13))
				score2=4;
			if((ex2a>13)&&(ex2a<=19))
				score2=4;
			if((ex2a>19)&&(ex2a<=24))
				score2=3;
			if((ex2a>24)&&(ex2a<=31))
				score2=3;
			if((ex2a>31)&&(ex2a<=40))
				score2=3;
			if((ex2a>=41)&&(ex2a<=51))
				score2=2;
			if(ex2a>51)
				score2=1;
		}

		if((ex2b>=127)&&(ex2b<=140)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=5;
			if((ex2a>5)&&(ex2a<=8))
				score2=5;
			if((ex2a>8)&&(ex2a<=13))
				score2=4;
			if((ex2a>13)&&(ex2a<=19))
				score2=4;
			if((ex2a>19)&&(ex2a<=24))
				score2=4;
			if((ex2a>24)&&(ex2a<=31))
				score2=3;
			if((ex2a>31)&&(ex2a<=40))
				score2=3;
			if((ex2a>=41)&&(ex2a<=51))
				score2=2;
			if(ex2a>51)
				score2=1;
		}

		if(ex4b<=208){				//ex4
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if(ex4a==5)
				score4=3;
			if(ex4a==6)
				score4=2;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=19))
				score4=1;
			if(ex4a>19)
				score4=1;
		}

		if((ex4b>=209)&&(ex4b<=244)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if(ex4a==5)
				score4=3;
			if(ex4a==6)
				score4=2;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=19))
				score4=1;
			if(ex4a>19)
				score4=1;
		}

		if((ex4b>=245)&&(ex4b<=265)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if(ex4a==5)
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=19))
				score4=1;
			if(ex4a>19)
				score4=1;
		}

		if((ex4b>=266)&&(ex4b<=280)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if(ex4a==5)
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=19))
				score4=1;
			if(ex4a>19)
				score4=1;
		}

		if((ex4b>=281)&&(ex4b<=296)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if(ex4a==5)
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=19))
				score4=2;
			if(ex4a>19)
				score4=1;
		}

		if((ex4b>=297)&&(ex4b<=308)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if(ex4a==5)
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=19))
				score4=2;
			if(ex4a>19)
				score4=1;
		}

		if((ex4b>=309)&&(ex4b<=326)){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=4;
			if(ex4a==4)
				score4=3;
			if(ex4a==5)
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=19))
				score4=2;
			if(ex4a>19)
				score4=1;
		}

		if((ex4b>=327)&&(ex4b<=341)){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=4;
			if(ex4a==4)
				score4=3;
			if(ex4a==5)
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=19))
				score4=2;
			if(ex4a>19)
				score4=1;
		}

		if((ex4b>=342)&&(ex4b<=363)){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=5;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=4;
			if(ex4a==4)
				score4=4;
			if(ex4a==5)
				score4=3;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=19))
				score4=2;
			if(ex4a>19)
				score4=1;
		}

		if((ex4b>=364)&&(ex4b<=409)){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=5;
			if(ex4a==2)
				score4=5;
			if(ex4a==3)
				score4=4;
			if(ex4a==4)
				score4=4;
			if(ex4a==5)
				score4=4;
			if(ex4a==6)
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=19))
				score4=2;
			if(ex4a>19)
				score4=1;
		}

		if(ex4b>=420){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=5;
			if(ex4a==2)
				score4=5;
			if(ex4a==3)
				score4=5;
			if(ex4a==4)
				score4=5;
			if(ex4a==5)
				score4=5;
			if(ex4a==6)
				score4=4;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=11))
				score4=3;
			if((ex4a>11)&&(ex4a<=19))
				score4=2;
			if(ex4a>19)
				score4=2;
		}


		if(ex7e<=2)				//ex7e
			score7e=1;
		if((ex7e>=3)&&(ex7e<=5))
			score7e=2;
		if((ex7e>=6)&&(ex7e<=9))
			score7e=3;
		if((ex7e>=10)&&(ex7e<=12))
			score7e=4;
		if(ex7e>=13)
			score7e=5;

		if(ex7f<=4)				//ex7f
			score7f=1;
		if((ex7f>=5)&&(ex7f<=8))
			score7f=2;
		if((ex7f>=9)&&(ex7f<=11))
			score7f=3;
		if((ex7f>=12)&&(ex7f<=14))
			score7f=4;
		if(ex7f>=15)
			score7f=5;

		if(ex7g<=3)				//ex7g
			score7g=1;
		if((ex7g>=4)&&(ex7g<=6))
			score7g=2;
		if((ex7g>=7)&&(ex7g<=9))
			score7g=3;
		if((ex7g>=10)&&(ex7g<=13))
			score7g=4;
		if(ex7g>=14)
			score7g=5;

		if(ex7h<=2)				//ex7h
			score7h=1;
		if((ex7h>=3)&&(ex7h<=5))
			score7h=2;
		if((ex7h>=6)&&(ex7h<=9))
			score7h=3;
		if((ex7h>=10)&&(ex7h<=13))
			score7h=4;
		if(ex7h>=14)
			score7h=5;

		if(ex7i<=5)				//ex7i
			score7i=1;
		if((ex7i>=6)&&(ex7i<=8))
			score7i=2;
		if((ex7i>=9)&&(ex7i<=12))
			score7i=3;
		if((ex7i>=13)&&(ex7i<=14))
			score7i=4;
		if(ex7i>=15)
			score7i=5;

		if(ex7j<=2)				//ex7j
			score7j=1;
		if((ex7j>=3)&&(ex7j<=5))
			score7j=2;
		if((ex7j>=6)&&(ex7j<=7))
			score7j=3;
		if((ex7j>=8)&&(ex7j<=9))
			score7j=4;
		if(ex7j==10)
			score7j=5;

	}

	public void detMark50andabove(){

		if(ex1<=13)					//ex1
			score1=1;
		if((ex1>13)&&(ex1<=18))
			score1=2;
		if((ex1>18)&&(ex1<=24))
			score1=3;
		if((ex1>24)&&(ex1<=30))
			score1=4;
		if((ex1>30)&&(ex1<=50))
			score1=5;

		if(ex3<=44)					//ex3
			score3=1;
		if((ex3>44)&&(ex3<=63))
			score3=2;
		if((ex3>63)&&(ex3<=77))
			score3=3;
		if((ex3>77)&&(ex3<=94))
			score3=4;
		if((ex3>=95))
			score3=5;

		if(ex5<=7)					//ex5
			score5=1;
		if((ex5>7)&&(ex5<=13))
			score5=2;
		if((ex5>13)&&(ex5<=19))
			score5=3;
		if((ex5>19)&&(ex5<=25))
			score5=4;
		if((ex5>25)&&(ex5<=35))
			score5=5;

		if(ex6<=25)					//ex6
			score6=1;
		if((ex6>25)&&(ex6<=34))
			score6=2;
		if((ex6>34)&&(ex6<=43))
			score6=3;
		if((ex6>43)&&(ex6<=52))
			score6=4;
		if((ex6>52))
			score6=5;


		if(ex2b<=18){					//ex2
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=5))
				score2=3;
			if((ex2a>5)&&(ex2a<=8))
				score2=2;
			if((ex2a>8)&&(ex2a<=12))
				score2=1;
			if((ex2a>12)&&(ex2a<=17))
				score2=1;
			if((ex2a>17)&&(ex2a<=22))
				score2=1;
			if((ex2a>22)&&(ex2a<=28))
				score2=1;
			if((ex2a>28)&&(ex2a<=35))
				score2=1;
			if((ex2a>=35)&&(ex2a<=47))
				score2=1;
			if(ex2a>48)
				score2=1;
		}

		if((ex2b>=19)&&(ex2b<=24)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=5))
				score2=3;
			if((ex2a>5)&&(ex2a<=8))
				score2=2;
			if((ex2a>8)&&(ex2a<=12))
				score2=1;
			if((ex2a>12)&&(ex2a<=17))
				score2=1;
			if((ex2a>17)&&(ex2a<=22))
				score2=1;
			if((ex2a>22)&&(ex2a<=35))
				score2=1;
			if((ex2a>35)&&(ex2a<=47))
				score2=1;
			if((ex2a>=47)&&(ex2a<=48))
				score2=1;
			if(ex2a>48)
				score2=1;
		}

		if((ex2b>=25)&&(ex2b<=32)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=3;
			if((ex2a>8)&&(ex2a<=12))
				score2=2;
			if((ex2a>12)&&(ex2a<=17))
				score2=1;
			if((ex2a>17)&&(ex2a<=22))
				score2=1;
			if((ex2a>22)&&(ex2a<=28))
				score2=1;
			if((ex2a>28)&&(ex2a<=35))
				score2=1;
			if((ex2a>=35)&&(ex2a<=47))
				score2=1;
			if(ex2a>47)
				score2=1;
		}

		if((ex2b>=33)&&(ex2b<=39)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=4;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=3;
			if((ex2a>8)&&(ex2a<=12))
				score2=3;
			if((ex2a>12)&&(ex2a<=17))
				score2=2;
			if((ex2a>17)&&(ex2a<=22))
				score2=1;
			if((ex2a>22)&&(ex2a<=28))
				score2=1;
			if((ex2a>28)&&(ex2a<=35))
				score2=1;
			if((ex2a>=35)&&(ex2a<=47))
				score2=1;
			if(ex2a>47)
				score2=1;
		}

		if((ex2b>=40)&&(ex2b<=47)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=12))
				score2=3;
			if((ex2a>12)&&(ex2a<=17))
				score2=2;
			if((ex2a>17)&&(ex2a<=22))
				score2=1;
			if((ex2a>22)&&(ex2a<=28))
				score2=1;
			if((ex2a>28)&&(ex2a<=35))
				score2=1;
			if((ex2a>=35)&&(ex2a<=47))
				score2=1;
			if(ex2a>47)
				score2=1;
		}

		if((ex2b>=48)&&(ex2b<=55)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=12))
				score2=3;
			if((ex2a>12)&&(ex2a<=17))
				score2=3;
			if((ex2a>17)&&(ex2a<=22))
				score2=2;
			if((ex2a>22)&&(ex2a<=28))
				score2=1;
			if((ex2a>28)&&(ex2a<=35))
				score2=1;
			if((ex2a>=35)&&(ex2a<=47))
				score2=1;
			if(ex2a>47)
				score2=1;
		}

		if((ex2b>=56)&&(ex2b<=65)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=12))
				score2=4;
			if((ex2a>12)&&(ex2a<=17))
				score2=3;
			if((ex2a>17)&&(ex2a<=22))
				score2=2;
			if((ex2a>22)&&(ex2a<=28))
				score2=2;
			if((ex2a>28)&&(ex2a<=35))
				score2=1;
			if((ex2a>=35)&&(ex2a<=47))
				score2=1;
			if(ex2a>47)
				score2=1;
		}

		if((ex2b>=66)&&(ex2b<=76)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=4;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=12))
				score2=4;
			if((ex2a>12)&&(ex2a<=17))
				score2=3;
			if((ex2a>17)&&(ex2a<=22))
				score2=3;
			if((ex2a>22)&&(ex2a<=28))
				score2=2;
			if((ex2a>28)&&(ex2a<=35))
				score2=1;
			if((ex2a>=35)&&(ex2a<=47))
				score2=1;
			if(ex2a>47)
				score2=1;
		}

		if((ex2b>=77)&&(ex2b<=88)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=5;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=12))
				score2=4;
			if((ex2a>12)&&(ex2a<=17))
				score2=3;
			if((ex2a>17)&&(ex2a<=22))
				score2=3;
			if((ex2a>22)&&(ex2a<=28))
				score2=3;
			if((ex2a>28)&&(ex2a<=35))
				score2=2;
			if((ex2a>=35)&&(ex2a<=47))
				score2=1;
			if(ex2a>47)
				score2=1;
		}

		if((ex2b>=89)&&(ex2b<=100)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=5;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=12))
				score2=4;
			if((ex2a>12)&&(ex2a<=17))
				score2=4;
			if((ex2a>17)&&(ex2a<=22))
				score2=3;
			if((ex2a>22)&&(ex2a<=28))
				score2=3;
			if((ex2a>28)&&(ex2a<=35))
				score2=2;
			if((ex2a>=35)&&(ex2a<=47))
				score2=1;
			if(ex2a>47)
				score2=1;
		}

		if((ex2b>=101)&&(ex2b<=114)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=5;
			if((ex2a>5)&&(ex2a<=8))
				score2=4;
			if((ex2a>8)&&(ex2a<=12))
				score2=4;
			if((ex2a>12)&&(ex2a<=17))
				score2=4;
			if((ex2a>17)&&(ex2a<=22))
				score2=3;
			if((ex2a>22)&&(ex2a<=28))
				score2=3;
			if((ex2a>28)&&(ex2a<=35))
				score2=3;
			if((ex2a>=35)&&(ex2a<=47))
				score2=2;
			if(ex2a>47)
				score2=1;
		}

		if((ex2b>=115)&&(ex2b<=140)){
			if(ex2a==0)
				score2=5;
			if(ex2a==1)
				score2=5;
			if((ex2a>1)&&(ex2a<=3))
				score2=5;
			if((ex2a>3)&&(ex2a<=5))
				score2=5;
			if((ex2a>5)&&(ex2a<=8))
				score2=5;
			if((ex2a>8)&&(ex2a<=12))
				score2=4;
			if((ex2a>12)&&(ex2a<=17))
				score2=4;
			if((ex2a>17)&&(ex2a<=22))
				score2=4;
			if((ex2a>22)&&(ex2a<=28))
				score2=3;
			if((ex2a>28)&&(ex2a<=35))
				score2=3;
			if((ex2a>=35)&&(ex2a<=47))
				score2=2;
			if(ex2a>47)
				score2=2;
		}

		if(ex4b<=187){				//ex4
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=3;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if((ex4a>4)&&(ex4a<=6))
				score4=2;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>12)&&(ex4a<=17))
				score4=1;
			if(ex4a>18)
				score4=1;
		}

		if((ex4b>=188)&&(ex4b<=219)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if((ex4a>4)&&(ex4a<=6))
				score4=2;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=17))
				score4=1;
			if(ex4a>17)
				score4=1;
		}

		if((ex4b>=220)&&(ex4b<=239)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if((ex4a>4)&&(ex4a<=6))
				score4=2;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=17))
				score4=1;
			if(ex4a>17)
				score4=1;
		}

		if((ex4b>=240)&&(ex4b<=254)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if((ex4a>4)&&(ex4a<=6))
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=17))
				score4=1;
			if(ex4a>17)
				score4=1;
		}

		if((ex4b>=255)&&(ex4b<=266)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if((ex4a>4)&&(ex4a<=6))
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=17))
				score4=2;
			if(ex4a>17)
				score4=1;
		}

		if((ex4b>=267)&&(ex4b<=279)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=3;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if((ex4a>4)&&(ex4a<=6))
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=17))
				score4=2;
			if(ex4a>17)
				score4=1;
		}

		if((ex4b>=280)&&(ex4b<=297)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if((ex4a>4)&&(ex4a<=6))
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=17))
				score4=2;
			if(ex4a>17)
				score4=1;
		}

		if((ex4b>=298)&&(ex4b<=311)){
			if(ex4a<=0)
				score4=4;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=3;
			if(ex4a==4)
				score4=3;
			if((ex4a>4)&&(ex4a<=6))
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=2;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=17))
				score4=2;
			if(ex4a>17)
				score4=1;
		}

		if((ex4b>=312)&&(ex4b<=331)){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=4;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=4;
			if(ex4a==4)
				score4=3;
			if((ex4a>4)&&(ex4a<=6))
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=17))
				score4=2;
			if(ex4a>17)
				score4=1;
		}

		if((ex4b>=331)&&(ex4b<=372)){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=5;
			if(ex4a==2)
				score4=4;
			if(ex4a==3)
				score4=4;
			if(ex4a==4)
				score4=4;
			if((ex4a>4)&&(ex4a<=6))
				score4=3;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=11))
				score4=2;
			if((ex4a>11)&&(ex4a<=17))
				score4=2;
			if(ex4a>17)
				score4=1;
		}
		if(ex4b>=373){
			if(ex4a<=0)
				score4=5;
			if(ex4a==1)
				score4=5;
			if(ex4a==2)
				score4=5;
			if(ex4a==3)
				score4=5;
			if(ex4a==4)
				score4=5;
			if((ex4a>4)&&(ex4a<=6))
				score4=4;
			if((ex4a>6)&&(ex4a<=8))
				score4=3;
			if((ex4a>8)&&(ex4a<=11))
				score4=3;
			if((ex4a>11)&&(ex4a<=17))
				score4=2;
			if(ex4a>17)
				score4=2;
		}

		if(ex7e<=2)				//ex7e
			score7e=1;
		if((ex7e>=3)&&(ex7e<=5))
			score7e=2;
		if((ex7e>=6)&&(ex7e<=9))
			score7e=3;
		if((ex7e>=10)&&(ex7e<=12))
			score7e=4;
		if(ex7e>=13)
			score7e=5;


		if(ex7f<=4)				//ex7f
			score7f=1;
		if((ex7f>=5)&&(ex7f<=8))
			score7f=2;
		if((ex7f>=9)&&(ex7f<=11))
			score7f=3;
		if((ex7f>=12)&&(ex7f<=15))
			score7f=4;
		if(ex7f>=16)
			score7f=5;

		if(ex7g<=3)				//ex7g
			score7g=1;
		if((ex7g>=4)&&(ex7g<=6))
			score7g=2;
		if((ex7g>=7)&&(ex7g<=9))
			score7g=3;
		if((ex7g>=10)&&(ex7g<=13))
			score7g=4;
		if(ex7g>=14)
			score7g=5;

		if(ex7h<=2)				//ex7h
			score7h=1;
		if((ex7h>=3)&&(ex7h<=5))
			score7h=2;
		if((ex7h>=6)&&(ex7h<=9))
			score7h=3;
		if((ex7h>=10)&&(ex7h<=13))
			score7h=4;
		if(ex7h>=14)
			score7h=5;

		if(ex7i<=5)				//ex7i
			score7i=1;
		if((ex7i>=6)&&(ex7i<=8))
			score7i=2;
		if((ex7i>=9)&&(ex7i<=12))
			score7i=3;
		if((ex7i>=13)&&(ex7i<=14))
			score7i=4;
		if(ex7i>=15)
			score7i=5;

		if(ex7j<=1)				//ex7j
			score7j=1;
		if((ex7j>=2)&&(ex7j<=4))
			score7j=2;
		if((ex7j>=5)&&(ex7j<=7))
			score7j=3;
		if((ex7j>=8)&&(ex7j<=9))
			score7j=4;
		if(ex7j==10)
			score7j=5;
	}

	public void check7(){
		if(score7j<=1){
			if(score7e>1)
				score7e=score7e-1;
			if(score7f>1)
				score7f=score7f-1;
			if(score7g>1)
				score7g=score7g-1;
			if(score7h>1)
				score7h=score7h-1;
			if(score7i>1)
				score7i=score7i-1;
		}
	}

	public void drawGraph(Graphics g){
		int y=0,x=0,a=0,b=0,c=0,d=0,e=0,f=0,k=0,h=0,j=0,l=0,m=0;
		for(int i=0;i<12;i++){
			g.drawLine(250,350+y,650,350+y);
			y=y+50;
		}
		for(int i=1;i<6;i++){
			g.drawString(""+i,250+x,360);
			x+=100;
		}

		for(int i=1;i<6;i++){
			g.drawString(""+i,250+e,610);
			e+=100;
		}

		for(int i=1;i<6;i++){
			g.drawString(""+i,250+f,660);
			f+=100;
		}

		for(int i=1;i<6;i++){
			g.drawString(""+i,250+k,710);
			k+=100;
		}

		for(int i=1;i<6;i++){
			g.drawString(""+i,250+h,760);
			h+=100;
		}

		for(int i=1;i<6;i++){
			g.drawString(""+i,250+j,810);
			j+=100;
		}

		for(int i=2;i<11;i++){
			g.drawString(""+i,250+a,410);
			a+=50;
		}

		for(int i=2;i<11;i++){
			g.drawString(""+i,250+b,460);
			b+=50;
		}

		for(int i=2;i<11;i++){
			g.drawString(""+i,250+c,510);
			c+=50;
		}

		for(int i=2;i<11;i++){
			g.drawString(""+i,250+d,560);
			d+=50;
		}

		for(int i=1;i<6;i++){
			g.drawString(""+i,250+l,860);
			l+=100;
		}

		for(int i=6;i<31;i+=6){
			g.drawString(""+i,250+m,910);
			m+=100;
		}

		g.setColor(Color.blue);
		g.drawString("Overall Result",250,348);
		g.drawString("Analysis of Situation",250,398);
		g.drawString("Accuracy",250,448);
		g.drawString("Reflexes",250,498);
		g.drawString("Impulsiveness",250,548);
		g.drawString("Nervous Temperament",250,598);
		g.drawString("Mood Swings",250,648);
		g.drawString("Emotional Exaltation",250,698);
		g.drawString("Aggressiveness",250,748);
		g.drawString("Willingness to Give Way",250,798);
		g.drawString("Show Off",250,848);
		g.drawString("Emotional Stability",250,898);
		g.setColor(Color.black);
	}

	public int graphtotal1and2(){
		int total1and2xcoord=0;

		if(total1and2score==1)
			total1and2xcoord=0;
		else if(total1and2score==2)
			total1and2xcoord=100;
		else if(total1and2score==3)
			total1and2xcoord=200;
		else if(total1and2score==4)
			total1and2xcoord=300;
		else if(total1and2score==5)
			total1and2xcoord=400;

		return 	total1and2xcoord;
	}

	public int graphscorea(){
		int scoreaxcoord=0;
		if(scorea==2)
			scoreaxcoord=0;
		if(scorea==3)
			scoreaxcoord=50;
		if(scorea==4)
			scoreaxcoord=100;
		if(scorea==5)
			scoreaxcoord=150;
		if(scorea==6)
			scoreaxcoord=200;
		if(scorea==7)
			scoreaxcoord=250;
		if(scorea==8)
			scoreaxcoord=300;
		if(scorea==9)
			scoreaxcoord=350;
		if(scorea==10)
			scoreaxcoord=400;

		return scoreaxcoord;
	}

	public int graphscoreb(){
		int scorebxcoord=0;
		if(scoreb==2)
			scorebxcoord=0;
		if(scoreb==3)
			scorebxcoord=50;
		if(scoreb==4)
			scorebxcoord=100;
		if(scoreb==5)
			scorebxcoord=150;
		if(scoreb==6)
			scorebxcoord=200;
		if(scoreb==7)
			scorebxcoord=250;
		if(scoreb==8)
			scorebxcoord=300;
		if(scoreb==9)
			scorebxcoord=350;
		if(scoreb==10)
			scorebxcoord=400;

		return scorebxcoord;
	}

	public int graphscorec(){
		int scorecxcoord=0;
		if(scorec==2)
			scorecxcoord=0;
		if(scorec==3)
			scorecxcoord=50;
		if(scorec==4)
			scorecxcoord=100;
		if(scorec==5)
			scorecxcoord=150;
		if(scorec==6)
			scorecxcoord=200;
		if(scorec==7)
			scorecxcoord=250;
		if(scorec==8)
			scorecxcoord=300;
		if(scorec==9)
			scorecxcoord=350;
		if(scorec==10)
			scorecxcoord=400;

		return scorecxcoord;
	}

	public int graphscored(){
		int scoredxcoord=0;
		if(scored==2)
			scoredxcoord=0;
		if(scored==3)
			scoredxcoord=50;
		if(scored==4)
			scoredxcoord=100;
		if(scored==5)
			scoredxcoord=150;
		if(scored==6)
			scoredxcoord=200;
		if(scored==7)
			scoredxcoord=250;
		if(scored==8)
			scoredxcoord=300;
		if(scored==9)
			scoredxcoord=350;
		if(scored==10)
			scoredxcoord=400;

		return scoredxcoord;
	}

	public int graphscore7e(){
		int score7excoord=0;
		if(score7e==1)
			score7excoord=0;
		if(score7e==2)
			score7excoord=100;
		if(score7e==3)
			score7excoord=200;
		if(score7e==4)
			score7excoord=300;
		if(score7e==5)
			score7excoord=400;

		return score7excoord;
	}

	public int graphscore7f(){
		int score7fxcoord=0;
		if(score7f==1)
			score7fxcoord=0;
		if(score7f==2)
			score7fxcoord=100;
		if(score7f==3)
			score7fxcoord=200;
		if(score7f==4)
			score7fxcoord=300;
		if(score7f==5)
			score7fxcoord=400;

		return score7fxcoord;
	}

	public int graphscore7g(){
		int score7gxcoord=0;
		if(score7g==1)
			score7gxcoord=0;
		if(score7g==2)
			score7gxcoord=100;
		if(score7g==3)
			score7gxcoord=200;
		if(score7g==4)
			score7gxcoord=300;
		if(score7g==5)
			score7gxcoord=400;

		return score7gxcoord;
	}

	public int graphscore7h(){
		int score7hxcoord=0;
		if(score7h==1)
			score7hxcoord=0;
		if(score7h==2)
			score7hxcoord=100;
		if(score7h==3)
			score7hxcoord=200;
		if(score7h==4)
			score7hxcoord=300;
		if(score7h==5)
			score7hxcoord=400;

		return score7hxcoord;
	}

	public int graphscore7i(){
		int score7ixcoord=0;
		if(score7i==1)
			score7ixcoord=0;
		if(score7i==2)
			score7ixcoord=100;
		if(score7i==3)
			score7ixcoord=200;
		if(score7i==4)
			score7ixcoord=300;
		if(score7i==5)
			score7ixcoord=400;

		return score7ixcoord;
	}

	public int graphscore7j(){
		int score7jxcoord=0;
		if(score7j==1)
			score7jxcoord=0;
		if(score7j==2)
			score7jxcoord=100;
		if(score7j==3)
			score7jxcoord=200;
		if(score7j==4)
			score7jxcoord=300;
		if(score7j==5)
			score7jxcoord=400;

		return score7jxcoord;
	}

	public int graphscore7k(){
		int score7kxcoord=0;
		int z=0;
		for(int i=0;i<31;i++){
		if(score7k==6+i)
			score7kxcoord=0+z;
			z+=17;
		}

		return score7kxcoord;
	}

	public void draw7knum(Graphics g){

		if(score7k==6)
			g.drawString("6",250,920);
		if(score7k==7)
		g.drawString("7",267,920);
		if(score7k==8)
		g.drawString("8",284,920);
		if(score7k==9)
		g.drawString("9",301,920);
		if(score7k==10)
		g.drawString("10",318,920);
		if(score7k==11)
		g.drawString("11",335,920);
		if(score7k==12)
		g.drawString("12",352,920);
		if(score7k==13)
		g.drawString("13",369,920);
		if(score7k==14)
		g.drawString("14",386,920);
		if(score7k==15)
		g.drawString("15",403,920);
		if(score7k==16)
		g.drawString("16",420,920);
		if(score7k==17)
		g.drawString("17",437,920);
		if(score7k==18)
		g.drawString("18",454,920);
		if(score7k==19)
		g.drawString("19",471,920);
		if(score7k==20)
		g.drawString("20",488,920);
		if(score7k==21)
		g.drawString("21",505,920);
		if(score7k==22)
		g.drawString("22",522,920);
		if(score7k==23)
		g.drawString("23",539,920);
		if(score7k==24)
		g.drawString("24",556,920);
		if(score7k==25)
		g.drawString("25",573,920);
		if(score7k==26)
		g.drawString("26",590,920);
		if(score7k==27)
		g.drawString("27",607,920);
		if(score7k==28)
		g.drawString("28",624,920);
		if(score7k==29)
		g.drawString("29",641,920);
		if(score7k==30)
		g.drawString("30",658,920);

		}

	public void drawgraphscores(Graphics g){
		g.drawOval(245+graphtotal1and2(),347,15,15);

		g.drawLine(250+graphscorea(),400,250+graphscoreb(),450);
		g.drawLine(250+graphscoreb(),450,250+graphscorec(),500);
		g.drawLine(250+graphscorec(),500,250+graphscored(),550);
		g.drawLine(250+graphscored(),550,250+graphscore7e(),600);
		g.drawLine(250+graphscore7e(),600,250+graphscore7f(),650);
		g.drawLine(250+graphscore7f(),650,250+graphscore7g(),700);
		g.drawLine(250+graphscore7g(),700,250+graphscore7h(),750);
		g.drawLine(250+graphscore7h(),750,250+graphscore7i(),800);
		g.drawLine(250+graphscore7i(),800,250+graphscore7j(),850);
		g.drawLine(250+graphscore7j(),850,250+graphscore7k(),900);
	}

	public void checkL(Graphics g){
		if(l28click==true)
				g.drawString("L28",40,700);
		if(l39click==true)
				g.drawString("L39",90,700);
		if(l45click==true)
				g.drawString("L45",130,700);
		if(l51click==true)
				g.drawString("L51",180,700);
	}

	public void drawgrade(Graphics g){
		g.drawLine(250,940,250,950);
		g.drawLine(300,940,300,950);
		g.drawLine(400,940,400,950);
		g.drawLine(500,940,500,950);
		g.drawLine(600,940,600,950);
		g.drawLine(700,940,700,950);
		g.drawString("Poor",255,950);
		g.drawString("Slightly Poor",305,950);
		g.drawString("Normal",405,950);
		g.drawString("Slightly Good",505,950);
		g.drawString("Good",605,950);

		g.setColor(Color.lightGray);
		g.drawLine(300,350,300,940);
		g.drawLine(400,350,400,940);
		g.drawLine(500,350,500,940);
		g.drawLine(600,350,600,940);
	}
	public void paint(Graphics g){
		setBackground(Color.white);
		if(check==true){
			if(age<=19)
				detMark19();
			if((age>=20)&&(age<=29))
				detMark29();
			if((age>=30)&&(age<=39))
				detMark39();
			if((age>=40)&&(age<=49))
				detMark49();
			if(age>=50)
				detMark50andabove();



			check7();
			calscore2minus3();
			det1and2();
			caltotal1and2();
			calculate();

			drawGraph(g);
			finaloutput(g);
			drawgrade(g);
			g.setColor(Color.red);
			checkL(g);
			drawgraphscores(g);
			draw7knum(g);
			draw(g);


		}
	}

}

