def getMax(arr):
    if len(arr)<=1:
        return False;
    elif(len(arr)==2):
        return arr[1]-arr[0]
    else:
        minimum=arr[0]
        max_profit=arr[1]-arr[0]
        for i in range(2,len(arr)):
            minimum=min(minimum,arr[i-1])
            max=arr[i]-minimum
            if max>max_profit:
                max_profit=max
        return max_profit


if __name__=="__main__":
    stocks=[10,7,5,8,11,9]
    stocks1=[1,2,3,4]
    stocks2=[100, 200, 300, 200, 100, 50, 200, 500]
    stocks3=[4, 3, 2, 1]
    print(getMax(stocks))
    print(getMax(stocks1))
    print(getMax(stocks2))
    print(getMax(stocks3))




