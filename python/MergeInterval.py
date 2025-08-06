# input
# 4
# 1 3
# 2 6
# 8 10
# 15 18

# output
# 1 6
# 8 10
# 15 18

def MergeInterval():
    n = int(input("Enter the number of intervals: "))
    intervals = []

    for i in range(n):
        start, end = map(int, input(f"Interval {i+1}: ").split())
        intervals.append([start, end])

    intervals.sort()
    # print(intervals)

    merged = []
    # f=0
    for interval in intervals:
        # if f==1:
        #     print(merged[-1][1] , interval[0])
        if not merged or merged[-1][1] < interval[0]:
            merged.append(interval)
            # print("if: ",merged)
            # f=1
        else:
            merged[-1] = (merged[-1][0], max(merged[-1][1], interval[1]))
            # print("else: ",merged)

   
    for start, end in merged:
        print(start, end)

MergeInterval()
