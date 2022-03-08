from Car import Car
from Account import Account

if __name__ == "__main__":
    
    car = Car("AMS234",Account("Andres Herrera","ADM987"))
    print(vars(car))