import static spark.Spark.*;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.SparkConf;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "zyHello World");
    }
}