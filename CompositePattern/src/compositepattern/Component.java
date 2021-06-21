package compositepattern;	 
	/**
	 * 
	 * ���ģʽ����֯��ʽ��������չʾ
	 * ʵ��ʹ����Ҷ��������������ȥʵ��Component
	 * ��������ĵİ���
	 */
	 
	public interface Component {
	    void operation();
	}
	 
	//Ҷ�����
	interface Leaf extends Component {
	 
	}
	 
	//�������
	interface Composite extends Component {
	    //List(Leaf)
	    void add(Component c);
	    void remove(Component c);
	    Component getChild(int index);
	}

