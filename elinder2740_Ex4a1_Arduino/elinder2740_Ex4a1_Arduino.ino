//#include <SimpleDHT.h>
//
//// for DHT11, 
////      VCC: 5V or 3V
////      GND: GND
////      DATA: 7
//int pinDHT11 = 7;
//SimpleDHT11 dht11(pinDHT11);
//
//void setup() {
//  Serial.begin(56700);
//}
//
//void loop() {
//  // start working...
//  Serial.println("=================================");
//  Serial.println("Sample DHT11...");
//  
//  // read without samples.
//  byte temperature = 0;
//  byte humidity = 0;
//  int err = SimpleDHTErrSuccess;
//  if ((err = dht11.read(&temperature, &humidity, NULL)) != SimpleDHTErrSuccess) {
//    Serial.print("Read DHT11 failed, err="); Serial.print(SimpleDHTErrCode(err));
//    Serial.print(","); Serial.println(SimpleDHTErrDuration(err)); delay(1000);
//    return;
//  }
//  
//  Serial.print("Sample OK: ");
//  Serial.print((int)temperature); Serial.print(" *C, "); 
//  Serial.print((int)humidity); Serial.println(" H");
//  
//  // DHT11 sampling rate is 1HZ.
//  delay(1500);
//}
/* YourDuino Ethernet Temperature/humidity Web Server
 Reads a DHT11 Sensor
 Outputs a web page with Temperature and Humidity
 terry@yourduino.com 
 
 Circuit:
 * Ethernet shield attached to pins 10, 11, 12, 13
 * DHT11 Sensor connected to Pin 7
 
 Based on code by David A. Mellis & Tom Igoe
 
 */
/*-----( Import needed libraries )-----*/
#include <SPI.h>
#include <Ethernet.h>
#include <SimpleDHT.h>
#include <Wire.h>

/*-----( Declare Constants and Pin Numbers )-----*/
//#define DHT11PIN 7  // The Temperature/Humidity sensor
int pinDHT11 = 7;
SimpleDHT11 dht11(pinDHT11);

// Enter a MAC address and IP address for your controller below.
// The IP address will be dependent on your local network:
byte mac[] = {
  0xDE, 0xAD, 0xBE, 0xEF, 0xFE, 0xED };

/*-----( Declare objects )-----*/
IPAddress Ip(192,168,1, 185);
IPAddress gateway(192, 168, 10, 1);
IPAddress subnet(255, 255, 255, 0);

IPAddress serverIp(204, 77, 50, 53);
int serverPort  = 80;
char pageName[] = "/api/sensorreadings";

//dht11 DHT11;  //The Sensor Object
/*-----( Declare Variables )-----*/

EthernetClient client;
// Declare http Post request data
char json[41];


#define delayMillis 10000UL
byte prevTempReading = 0;


void setup()   /****** SETUP: RUNS ONCE ******/ 
{
  // Open serial communications and wait for port to open:
  Serial.begin(115200);
  while (!Serial) {
    ; // wait for serial port to connect. Needed for Leonardo only
 
  }

  // start the Ethernet connection and the server:
 if Ethernet.begin(mac) == 0);{
  Serial.println("Failed to configure Ethernet using DHCP");
  Ethernet.begin(mac, arduinoIp, gateway, subnet);
 }
 delay(1000);
}//--(end setup )---


void loop()   /*----( LOOP: RUNS OVER AND OVER AGAIN )----*/
{
  Ethernet.maintain();

  thisMillis = millis();
  if (thisMillis - delayMillis) {
    lastMillis = thisMillias;

    byte currTempReading = 0;
    byte currHumidReading = 0;
    int err = SimpleDHTErrSuccess;
    err = dht11.read(pinDHT11, &currTempReading, &currHumidReading, NULL);

    if (currTempReading != prevTempReading) {
      sprintf(json);
      
    }
  }
} // END Loop

/*-----( Declare User-written Functions )-----*/
// --------------------------------- postPage()  ---------------------------------
// ---------------------- Performs http Post of json payload ---------------------
byte postPage(char* json)
{
  int inChar;
  Serial.println("postPage() connecting...");

  if (client.connect(serverIp, serverPort)) {
    Serial.println("postPage() connected");

    // send http header
    client.println("POST /propertymonitor/api/sensorreadings HTTP/1.1");
    client.println("Host: 204.77.50.53"); // Don't change. Leave set to server address.
    client.println("User-Agent: Arduino/uno ethernet");
    client.println("Connection: close");
    client.println("Content-Type: application/json");
    client.print("Content-Length: ");
    client.println(strlen(json));// number of bytes in the payload
    client.println();// important: need an empty line here
    // send payload
    client.println(json);
  }
  else
  {
    Serial.println(F("postPage() connect failed"));
    return 0;
  }

  int connectLoop = 0;

  while(client.connected())
  {
    while(client.available())
    {
      inChar = client.read();
      Serial.write(inChar);
      connectLoop = 0;
    }

    delay(1);
    connectLoop++;
    if(connectLoop > 10000)
    {
      Serial.println();
      Serial.println(F("Timeout"));
      client.stop();
    }
  }

  Serial.println();
  Serial.println(F("disconnecting."));
  client.stop();
  return 1;
}



////
////Celsius to Fahrenheit conversion
//double Fahrenheit(double celsius)
//{
//  return 1.8 * celsius + 32;
//}
//
////Celsius to Kelvin conversion
//double Kelvin(double celsius)
//{
//  return celsius + 273.15;
//}
//
//// dewPoint function NOAA
//// reference: http://wahiduddin.net/calc/density_algorithms.htm 
//double dewPoint(double celsius, double humidity)
//{
//  double A0= 373.15/(273.15 + celsius);
//  double SUM = -7.90298 * (A0-1);
//  SUM += 5.02808 * log10(A0);
//  SUM += -1.3816e-7 * (pow(10, (11.344*(1-1/A0)))-1) ;
//  SUM += 8.1328e-3 * (pow(10,(-3.49149*(A0-1)))-1) ;
//  SUM += log10(1013.246);
//  double VP = pow(10, SUM-3) * humidity;
//  double T = log(VP/0.61078);   // temp var
//  return (241.88 * T) / (17.558-T);
//}
//
//// delta max = 0.6544 wrt dewPoint()
//// 5x faster than dewPoint()
//// reference: http://en.wikipedia.org/wiki/Dew_point
//double dewPointFast(double celsius, double humidity)
//{
//  double a = 17.271;
//  double b = 237.7;
//  double temp = (a * celsius) / (b + celsius) + log(humidity/100);
//  double Td = (b * temp) / (a - temp);
//  return Td;
//}
///* ( THE END ) */
