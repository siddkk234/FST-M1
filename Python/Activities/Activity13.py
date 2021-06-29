
NumbersList=[1, 2, 3, 4, 5, 6]
def sum_of_numbers(nos):
    Sum=0
    for number in nos:
       Sum+=number

    return Sum

SumValue= sum_of_numbers(NumbersList)

print("Sum of numbers"+ str(SumValue))   

