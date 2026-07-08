# function to find the prefix sum array
def prefSum(arr):
    n = len(arr)
    preq = [0]*n
    preq[0]=arr[0]

    for i in range(1,n):
        preq[i]=preq[i-1]+arr[i-1]
    return preq

if __name__ == "__main__":
    arr = [10, 20, 10, 5, 15]
    prefixSum = prefSum(arr)
    for i in prefixSum:
        print(i, end=" ")
