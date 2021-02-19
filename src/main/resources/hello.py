import sys

# print('Number of arguments:', len(sys.argv), 'arguments.')
# print ('Argument List:', str(sys.argv))

allArguments = sys.argv[1:len(sys.argv)]
print('All arguments (without script name):', allArguments)
print('\n')