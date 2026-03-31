def MaximumWealth(account):
    max = 0
    for customer in account:
        wealth = sum(customer)
        if wealth > max:
            max = wealth
    return max
account = [[1,2,3],[3,2,1]]
print(MaximumWealth(account))