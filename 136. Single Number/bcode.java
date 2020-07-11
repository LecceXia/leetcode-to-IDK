int singleNumber(int A[], int n) {
    int result = 0;
    for (int i = 0; i<n; i++)
    {
		result ^=A[i];
    }
	return result;
}

//这解法真的巧妙，利用XOR，A XOR A=0   A XOR 0=A
