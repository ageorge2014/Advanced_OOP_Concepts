public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public Database(String contents)
    {
       while (contents != null)
       {
           String[] values = contents.split("\n");

           if (int i = 0; values[i] < 5; i++)
           {
               this.colNames = values[i];
               this.colNames ++;

           }

           while (values[i] > 4 && contents)
           {
               data = contents[numRows][colNames]
           }
           this.numRows =
       }




    public String getValue(String columnName,int row){
/* TODO */
This method should return the data contained on row "row" and the column matching  @columname
    }

}


