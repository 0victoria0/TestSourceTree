//枚举可以单独声明或者声明在类里面。方法、变量、构造函数也可以在枚举中定义。
/*
	一个类可以包含以下类型变量：
		局部变量：在方法、构造方法或者语句块中定义的变量称为局部变量。变量声明和初始化都是在方法中，方法结束后，
			变量就会自动销毁。
		成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、
			构造方法和特定类的语句块访问。
		类变量：类变量也声明在类中，方法体之外，但必须申明为static类型。
 */
/*
	每个类都有构造方法。如果没有显示的为类定义构造方法，Java编译器将会为该类提供一个默认的构造方法。
	在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类名相同，一个类可以有多个构造方法。
 */


/*＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊源文件申明规则＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊
	＊一个源文件只能有一个public类
	＊一个源文件可以有多个非public类
	＊源文件的名称应该和public类的类名保持一致。例如：源文件中的public类中的类名是Employee，那么源文件应该
	命名为Employee。
	＊如果一个类定义在某个包中，那么package语句应该在源文件的首行。
	＊如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么import语句
	应该在源文件中最前面。
	＊import语句和package语句对源文件中定义的所有类都有效。在同一个源文件中，不能给不同的类不同的包声明。
 */

/*＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊Java包＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊
	包主要用来对类和接口进行分类。当开发Java程序时，可能编写成千上万的类，因此很有必要对类和接口进行分类。
*/

/*＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊Import语句＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊
	在Java中，如果给出一个完整的限定名，包括包名，类名，那么Java编译器久可以很容易地定位到源代码或者类。
	Import语句就是用来提供一个合理的路径，使得编译器可以找到某个类。
 */
class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDUIM, LARGE }//枚举
   FreshJuiceSize size;//成员变量  大小
   Color color;//颜色  
   String breed;//

   //构造方法
   FreshJuice(String name){
   	//这个构造函数仅有一个参数name
   	System.out.println(name+"juice");
   }

   //方法生成果汁
   void breedJuice(){

   }
}

enum Color{ RED, BLUE, GREEN }

public class FreshJuiceTest {
   public static void main(String []args){
      FreshJuice juice = new FreshJuice("apple");
      juice.size = FreshJuice. FreshJuiceSize.MEDUIM;
      juice.color = Color.RED;
      System.out.println(juice.size);
      System.out.println(juice.color);

      FreshJuice juice00 = new FreshJuice("banana");
   }
}






