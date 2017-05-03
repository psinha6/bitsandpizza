import com.example.prateekkumars.bitsandpizzas.R;

/**
 * Created by prateekkumars on 5/3/2017.
 */

public class Pizza {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    private int imageResourceId;

    public static final Pizza[] pizza = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi),
    };
    private Pizza(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
}
