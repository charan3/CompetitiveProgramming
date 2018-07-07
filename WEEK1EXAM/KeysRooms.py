
arr=[[[1],[0,2],[3]],[[1,3],[3,0,1],[2],[0]],[[1,2,3],[0],[0],[0]],[[1],[0,2,4],[1,3,4],[2],[1,2]],[[1],[2,3],[1,2],[4],[1],[5]],[[1],[2],[3],[4],[2]],[[1],[1,3],[2],[2,4,6],[],[1,2,3],[1]]];

def room(no,count):
    if no<len(count):
        count[no]=True
    for i in list[no]:
        if i<len(count):
            if count[i]==False:
                room(i,count)


for list in arr:
    count = [False] * len(list)
    room(0, count)
    flag=0
    for i in count:
        if i is False:
            print(False)
            flag=1
    if flag==0:
        print(True)

