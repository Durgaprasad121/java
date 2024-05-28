class employee{
	double gs;
	int empid;
	String empname;
	int empage;
	employee(int eid,String ename,int eage){
		empid=eid;
		empname=ename;
		empage=eage;
		System.out.println("Employee id is "+eid+" and employee name "+ename+" and employee age is "+eage);
	}
	void calculatesalary(int bs,double da,double hra,int oa){
		double gp;
		gp=bs+da*bs+hra*bs+oa;
		gs=gp;
	}
	double getsalary(){
		double ns,it=1250.75,pt=200.0;
		ns=gs-it-pt;
		return ns;
	}
}		
class empdemo{
	public static void main(String args[]){
		employee ramu=new employee(1101,"ramakrishna",30);
		ramu.calculatesalary(10000,0.80,0.10,5000);
		System.out.println("ramu net monthly salary is "+ramu.getsalary());
	}
}