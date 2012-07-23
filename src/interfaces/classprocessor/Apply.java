package interfaces.classprocessor;

import java.util.Arrays;

//策略设计模式
class Processor {
	String name() {
		return this.getClass().getSimpleName();
	}

	Object process(Object input) {
		return input;
	}
}

// 转为大写类
class Upcase extends Processor {
	String process(Object input) {
		return ((String) input).toUpperCase(); // 装为大写
	}
}

// 转为小写类
class Downcase extends Processor {
	String process(Object input) {
		return ((String) input).toLowerCase(); // 转为小写
	}
}

// 切割类
class Splitter extends Processor {
	String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}

public class Apply {
	public static void process(Processor p, Object ob) {
		System.out.println("Using Processor: " + p.name());
		System.out.println(p.process(ob));
	}

	public static String str = "Test test class Processor";

	public static void main(String[] args) {
		process(new Upcase(), str);
		process(new Downcase(), str);
		process(new Splitter(), str);

	}
}
