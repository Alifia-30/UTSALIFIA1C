import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UTSALIFIA1C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input tiga angka dipisahkan dengan spasi = ");
        String[] p_ = reader.readLine().split( "");
        int _c = 34;
        int _n = 67;
        int _z = 103;
        boolean _bool;
        if (_c + _n + _z > 100) {
            _bool = false;
            if (_bool = true) {
                System.out.println("you are not authorized");
            } else if (_bool = false) {
                int h_ = 0;
                for (int index = 0; index < 5; index++) {
                    h_ = _c + _n - _z + h_;
                }
                System.out.println("total number is = " + h_);
            }
        }else {
            System.out.println("contact your administrator...");
        }
    }
}
