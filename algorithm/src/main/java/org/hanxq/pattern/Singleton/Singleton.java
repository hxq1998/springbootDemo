/**
 * 这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
不能通过 reflection attack 来调用私有构造方法。
 */
package org.hanxq.pattern.Singleton;

public class Singleton {

	// 私有化构造方法
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return enumSingleton.INSTANCE.getInstance();
	}
	
	// 私有化的枚举类型
	private static enum enumSingleton{
		INSTANCE;
		
		
		
		private Singleton singleton;
		
		//JVM会保证此方法绝对只调用一次
		private enumSingleton(){
			singleton = new Singleton();
			System.out.println("调用了！");
		}
		
		public Singleton getInstance(){
			return this.singleton;
		}
		
		
	}
	
	// 枚举类Light
	public static enum Light{
		
		RED(1),GREEN(3),BLUE(5);
		
		// 定义私有变量
		private int code;
		
		private Light(int c){
			this.code = c;
		}
		
		public int getCode() {
			return code;
		}
		
	}
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(Singleton.Light.BLUE.getCode() + 1);
	}
}
