
NO_OF_CHARS = 26

def checkAnagram(str1, str2):
    count1 = [0] * NO_OF_CHARS
    for i in str1:
        if i!=' ':
            count1[ord(i)-97]+=1

    for i in str2:
        if i!=' ':
            count1[ord(i)-97]-=1
    print(count1)
    sum=0
    for i in count1:
        if i!=0:
            return 0
    if sum==0:
        return 1


string1 = ["anagram","Keep","MOther In Law","School Master","ASTRONOMERS", "Toss","joy","Debit Card","SiLeNt CAT"]
string2 = ["nagaram", "Peek", "Hitler Woman", "The Classroom", "NO MORE STARS", "Shot", "enjoy", "Bad Credit", "LisTen Act"]



for i in range(len(string1)):

    if checkAnagram(string1[i].lower(),string2[i].lower()):
        print("True")
    else:
        print("False")
