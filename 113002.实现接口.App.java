
public class App extends R implements S {
public static void main(String[] args) {
	R r = new R();
    System.out.println(r.boy_filePathString);
    System.out.println(r.girl_filePathString);
    for (int i=0;i<r.arry2d.length;i++){
        for (int j=0;j<r.arry2d[i].length;j++){
            System.out.print(r.arry2d[i][j]+" ");
        }
        System.out.println();
    }
    String b = S.boy_filePathString;
    System.out.println(b);
    String c = S.girl_filePathString;
    System.out.println(c);
    for (int i=0;i<S.arr.length;i++){
        for (int j=0;j<S.arr[i].length;j++){
            System.out.print(S.arr[i][j]+" ");
        }
        System.out.println();
    }

}

@Override
public void sss() {
    System.out.println("hahaha");
}
}
