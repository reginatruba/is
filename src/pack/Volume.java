package pack;

public class Volume {
	static double d_in_a, d_in_h, d_in_l, d_in_t, res_in_a, res_in_h, res_in_l, res_in_t, res_in_v,
	res_out_a, res_out_h, res_out_l, res_out_v;
	/* Переменные типа double - с плавающей точкой. служат для представления чисел, имеющих дробную часть */
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса.*/

	public static void gettext() {/*Класс gettext, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */

		d_in_a = Double.parseDouble(Index.in_a.getText());
		d_in_h = Double.parseDouble(Index.in_h.getText());	
		d_in_l = Double.parseDouble(Index.in_l.getText());	
		d_in_t = Double.parseDouble(Index.in_t.getText());	
		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
		Преобразование данных в тип Double. */
		
	}

	public static void vol() {/*Класс, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */

		/* Если пользователь ввел внутренние размеры, то нужно рассчитать внешние размеры коробки и объем.
		 * Если пользователь ввел внешние размеры, то нужно рассчитать внутренние размеры коробки и объем. */
		if (Index.int_in==1){ //переменная которая отвечает за то что были введены внутренние размеры
			res_in_a=d_in_a; //внутренняя ширина
			res_in_h=d_in_h; //внутренняя высота
			res_in_l=d_in_l; //внутренняя глубина
			res_in_t=d_in_t; //толщина материала
			/* объем рассчитывается по формуле v=in_a*in_h*in_l. умножить на 1000 для перевода м^3 в литры.
			 * делим на 100 каждое число для перевода см в метры */
			res_in_v=res_in_a/100*res_in_h/100*res_in_l/100*1000;
			/* внешние размеры рассчитываются как внутренние размеры + толщина двух стенок  */
			res_out_a=d_in_a+2*d_in_t;
			res_out_h=d_in_h+2*d_in_t;
			res_out_l=d_in_l+2*d_in_t;
			/* объем рассчитывается по формуле v=out_a*out_h*out_l. умножить на 1000 для перевода м^3 в литры.
			 * делим на 100 каждое число для перевода см в метры  */
			res_out_v=res_out_a/100*res_out_h/100*res_out_l/100*1000;
						
		} else { //пользователь ввел внешние размеры
			/* внутренние размеры рассчитываются как внешние размеры минус толщина двух стенок */
			res_in_a=d_in_a-2*d_in_t;
			res_in_h=d_in_h-2*d_in_t;
			res_in_l=d_in_l-2*d_in_t;
			res_in_t=d_in_t;
			/* объем рассчитывается по формуле v=in_a*in_h*in_l.умножить на 1000 для перевода м^3 в литры.
			 * делим на 100 каждое число для перевода см в метры  */
			res_in_v=res_in_a/100*res_in_h/100*res_in_l/100*1000;
			res_out_a=d_in_a;
			res_out_h=d_in_h;
			res_out_l=d_in_l;
			/* объем рассчитывается по формуле v=out_a*out_h*out_l. умножить на 1000 для перевода м^3 в литры.
			 * делим на 100 каждое число для перевода см в метры  */
			res_out_v=res_out_a/100*res_out_h/100*res_out_l/100*1000;
		}
		
		//форматированный вывод
	    String in_a_str = String.format("%.2f", res_in_a);
	    String in_h_str = String.format("%.2f", res_in_h);
	    String in_l_str = String.format("%.2f", res_in_l);
	    String in_t_str = String.format("%.2f", res_in_t);
	    String in_v_str = String.format("%.2f", res_in_v);
	    String out_a_str = String.format("%.2f", res_out_a);
	    String out_h_str = String.format("%.2f", res_out_h);
	    String out_l_str = String.format("%.2f", res_out_l);
	    String out_v_str = String.format("%.2f", res_out_v);
	    /* String - указываем что переменная будет иметь строковый тип,
	     * String_sred_100km_1 - название новой переменной,
	     * String.format - преобразование переменной в строкой тип,
	     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
	     	double_sred_100km - переменная типа double, которую надо преобразовать в строковый тип
	     	 */
		
	    Result.in_a_label.setText(in_a_str);
	    Result.in_h_label.setText(in_h_str);
	    Result.in_l_label.setText(in_l_str);
	    Result.in_t_label.setText(in_t_str);
	    Result.in_v_label.setText(in_v_str);
	    Result.out_a_label.setText(out_a_str);
	    Result.out_h_label.setText(out_h_str);
	    Result.out_l_label.setText(out_l_str);
	    Result.out_v_label.setText(out_v_str);
 
	    /* Записываем строковые переменные в текстовые поля Name.., которые расположены в файле Result */
		
	   
	}	
}

