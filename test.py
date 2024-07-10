import pandas as pd
import os

current_directory = os.getcwd()
print(f"Current working directory: {current_directory}")

file_path = r"C:/Users/mande/OneDrive/Desktop/datas.csv"

variable = pd.read_csv(file_path)
print(variable.head())
