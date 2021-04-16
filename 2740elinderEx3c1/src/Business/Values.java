package Business;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Values {
  //  private float[] values = {
  //          75.2f, 73.4f, 75.2f, 73.4f, 75.2f, 73.4f, 75.2f, 73.4f, 71.6f, 73.4f,
  //          71.6f, 73.4f, 71.6f, 73.4f, 71.6f, 73.4f, 75.2f, 77f, 78.8f, 80.6f,
  //          82.4f, 84.2f, 82.4f, 84.2f, 82.4f, 84.2f, 86f, 87.8f, 86f, 84.2f,
  //          82.4f, 80.6f, 82.4f, 80.6f, 82.4f, 80.6f, 82.4f, 80.6f, 78.8f, 77f,
  //          78.8f, 77f, 75.2f, 77f, 75.2f, 73.4f, 75.2f, 73.4f, 75.2f, 73.4f};

    private ArrayList<Float> values = new ArrayList<>();
    
    public Values() {
        values.add(75.2f);
        values.add(73.4f);
        values.add(75.2f);
        values.add(73.4f);
        values.add(75.2f);
        values.add(73.4f);
        values.add(75.2f);
        values.add(73.4f);
        values.add(71.6f);
        values.add(73.4f);
        values.add(71.6f);
        values.add(73.4f);
        values.add(71.6f);
        values.add(73.4f);
        values.add(71.6f);
        values.add(73.4f);
        values.add(75.2f);
        values.add(77f);
        values.add(78.8f);
        values.add(80.6f);
        values.add(82.4f);
        values.add(84.2f);
        values.add(82.4f);
        values.add(84.2f);
        values.add(82.4f);
        values.add(84.2f);
        values.add(86f);
        values.add(87.8f);
        values.add(86f);
        values.add(84.2f);
        values.add(82.4f);
        values.add(80.6f);
        values.add(82.4f);
        values.add(80.6f);
        values.add(82.4f);
        values.add(80.6f);
        values.add(82.4f);
        values.add(80.6f);
        values.add(78.8f);
        values.add(77f);
        values.add(78.8f);
        values.add(77f);
        values.add(75.2f);
        values.add(77f);
        values.add(75.2f);
        values.add(73.4f);
        values.add(75.2f);
        values.add(73.4f);
        values.add(75.2f);
        values.add(73.4f);
    }

    public float calcTotal(){
        float sum = 0;
        for(int i = 0; i < values.size(); i++)
            sum += values.get(i);
        sum = Math.round(sum * 10.0f) / 10.0f;
        return sum;
    }

    public float calcMin() {
        float minimum = values.get(0);
        for(int i = 0; i < values.size(); i++)
        {
            float number = values.get(i);
            if(number < minimum)
                minimum = number;
        }
        return minimum;
    }

    public float calcMax() {
        float maximum = values.get(0);
        for(int i = 0; i < values.size(); i++) {
            float number = values.get(i);
            if (number > maximum)
                maximum = number;
        }
        return maximum;
    }

            public float calcAvg () {
                float total = 0;
                float avg = 0;
                for (int i = 0; i < values.size(); i++) {
                    total += values.get(i);
                    avg = total / values.size();
                }
                avg = Math.round(avg * 100);
                avg = avg / 100;
                return avg;
            }
        }
