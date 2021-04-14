package business;

public class Values {
    private float[] values = {
            75.2f, 73.4f, 75.2f, 73.4f, 75.2f, 73.4f, 75.2f, 73.4f, 71.6f, 73.4f,
            71.6f, 73.4f, 71.6f, 73.4f, 71.6f, 73.4f, 75.2f, 77f, 78.8f, 80.6f,
            82.4f, 84.2f, 82.4f, 84.2f, 82.4f, 84.2f, 86f, 87.8f, 86f, 84.2f,
            82.4f, 80.6f, 82.4f, 80.6f, 82.4f, 80.6f, 82.4f, 80.6f, 78.8f, 77f,
            78.8f, 77f, 75.2f, 77f, 75.2f, 73.4f, 75.2f, 73.4f, 75.2f, 73.4f};

    public float calcTotal() {

        float sum = 0;
        for (int i = 0; i < values.length; i++) {
             sum += values[i];
        }
        sum = Math.round(sum * 100);
        sum = sum/100;
        return sum;
    }

    public float calcMin() {
        float minValue = values[0];

        for(int i = 0; i < values.length; i++){
            if(values[i] < minValue){
                minValue = values[i];
            }
        }
        return minValue;
    }

    public float calcMax() {
        float maxValue = values[0];

        for(int i = 0; i < values.length; i++){
            if(values[i] > maxValue){
                maxValue = values[i];
            }
        }
        return maxValue;
    }

            public float calcAvg () {
                float sum = 0;
                for (int i = 0; i < values.length; i++) {
                    sum += values[i] / 50;
                }
                sum = Math.round(sum * 100);
                sum = sum / 100;
                return sum;
            }
        }
