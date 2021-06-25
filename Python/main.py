import pymysql

class DataBase:
  def __init__(self):
     self.connection = pymysql.connect(
       host = 'localhost',
       user = 'root',
       password='Cs:go1.6S',
       db = 'prueba2'
     )

     self.cursor = self.connection.cursor()
     print ('Hay conexion')
   
  def select_humano(self, id):
     sql = 'SELECT id,name,gener FROM humanos WHERE id = {} '.format(id) 
     
     try:
        self.cursor.execute(sql)
        user = self.cursor.fetchone()
 
        print('Id: ',user[0])
        print('name ', user[1])
        print('genero: ', user[2])

        return user[0]

     except TypeError:
      print('ese Id no se reconoce')

  def select_all_humanos(self):
  	sql = 'SELECT id, name, gener from humanos'

  	try:
  		self.cursor.execute(sql)
  		users = self.cursor.fetchall()

  		for user in users:
  			print('Id:' ,user[0])
  			print('name:' ,user[1])
  			print('genero' ,user[2])

  	except Exception as e:
  		raise

  def update_humanos_name(self,id,name):
  	sql= "UPDATE humanos SET name='{}' WHERE id= {}".format(name,id)

  	try:
  		self.cursor.execute(sql)
  		self.connection.commit()
  		
    A
  	except Exception as e:
  		raise 

  def close(self):
  	self.connection.close()

database = DataBase()

#database.select_all_humanos()
#database.select_humano(2)
#database.update_humanos_name(2,'Juan')
database.select_humano(5)


database.close()

