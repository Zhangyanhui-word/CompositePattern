package compositepattern;	 
	/**
	 * 
	 * 组合模式的组织形式，仅用于展示
	 * 实际使用是叶子组件与容器组件去实现Component
	 * 具体见下文的案例
	 */
	 
	public interface Component {
	    void operation();
	}
	 
	//叶子组件
	interface Leaf extends Component {
	 
	}
	 
	//容器组件
	interface Composite extends Component {
	    //List(Leaf)
	    void add(Component c);
	    void remove(Component c);
	    Component getChild(int index);
	}

