import math
import random
import csv

def encode_class(mydata):
    classes=[]
    for i in range(len(mydata)):
        if mydata[i][-1]not in classes:
            classes.append(mydata[i][-1])
    
    for i in range(len(classes)):
        for j in range(len(mydata)):
            if mydata[j][-1]==classes[i]:
                mydata[j][-1]=i 
                
    return mydata  
    
#splitting data
def splitting(mydata,ratio):
    train_num=int(len(mydata) * ratio)
    train=[]
    # initially testset will have all the dataset
    test=list(mydata)
    while len(train)< train_num:
        # index generated randomly from range 0
        # to length of testset
        index=random.randrange(len(test))
        # from testset, pop data rows and put it in train
        train.append(test.pop(index))
        
    return train,test 
    
# Group the data rows under each class yes or
# no in dictionary e              g: dict[yes] and dict[no]

def groupUnderClass(mydata):
    dict={}
    for i in range(len(mydata)):
        if(mydata[i][-1] not in dict):
            dict[mydata[i][-1]]=[]
        dict[mydata[i][-1]].append(mydata[i])
    
    return dict 
    
# Calculating Mean
def mean(n):
    return sum(n)/float(len(n))
    
# Calculating Standard Deviation
def std_dev(numbers):
    avg=mean(numbers)
    
    
    
    



