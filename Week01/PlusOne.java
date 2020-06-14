class PlusOne {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        for(int n = size -1; n >= 0; n--){
            digits[n]++;
            digits[n] = digits[n] % 10;
            if (digits[n] != 0 ){
                return digits;
            }
        }
        digits = new int[size+1];
        digits[0] = 1;
        return  digits ;

    }
}
