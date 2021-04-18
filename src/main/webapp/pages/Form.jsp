<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
header {
	background:blue;
	padding:20px 600px
}
div {
  display: inline-block;
  padding:60px;
  }
</style>
</head>
<body>
<header>
<h1>Music Studio Database Update</h1>
</header>
<section class="strip">
</section>
<section class="form">
<form action="http://localhost:8080/add" method="post">
<div class="Musician">
<h2>Musician Details:</h2>
<label for="musicianName"><h3>Musician Name:</h3></label>
  <input placeholder="Enter the name of artist" id="musicianName" type="text"  name="musicianName" size="50"><br><br>
  <label for="SSN"><h3>Social Security Number:</h3></label>
  <input placeholder="Enter SSN" id="SSN" type="text"  name="SSN"  size="50"><br><br>
</div>

<div class="Album">
<h2>Album Details:</h2>
<label for="albumTitle"><h3>Album Title:</h3></label>
  <input placeholder="Enter the title of album" id="title" type="text"  name="title" size="50"><br><br>
  <label for="identifier"><h3>Album Identification Number:</h3></label>
  <input placeholder="Enter album identification number" id="identifier" type="text"  name="identifier"  size="50"><br><br>
        <label for="copyrightdate"><h3>Copyright date:</h3></label>
  <input placeholder="Enter the copyright date" id="copyrightdate" type="text"  name="copyrightdate" size="50"><br><br>
  <label for="format"><h3>Format of  Album:</h3></label>
  <input placeholder="Enter the format" id="format" type="text"  name="format" size="50"><br><br>
</div>

<div class="Song">
<h2>Song Details:</h2>
<label for="songid"><h3>Song Identification Number :</h3></label>
  <input placeholder="Enter the song identification number" id="songid" type="text"  name="songid" size="50"><br><br>
  <label for="author"><h3>Song Writer:</h3></label>
  <input placeholder="Enter the name of song writer" id="author" type="text"  name="author"  size="50"><br><br>
        <label for="songTitle"><h3>Title of the song:</h3></label>
  <input placeholder="Enter the title of the song" id="songTitle" type="text"  name="songTitle" size="50"><br><br>
</div>

<div class="Instruments">
<h2>Instrument Details:</h2>
<label for="instrumentName"><h3>Name of the Instrument:</h3></label>
  <input placeholder="Enter the name of the instrument" id="instrumentName" type="text"  name="instrumentName" size="50"><br><br>
  <label for="key"><h3>Key:</h3></label>
  <input placeholder="Enter the key" id="key" type="text"  name="key"  size="50"><br><br>
        <label for="instrumentId"><h3>Instrument Id:</h3></label>
  <input placeholder="Enter Instrumet identification number?" id="instrumentId" type="text"  name="instrumentId" size="50"><br><br>
</div>

<div class="Address">
<h2>Address Details:</h2>
<label for="address"><h3>Address of Musician:</h3></label>
  <input placeholder="Enter the address" id="address" type="text"  name="address"  size="50"><br><br>
<label for="phone"><h3>Phone:</h3></label>
  <input placeholder="Enter the phone number" id="phone" type="text"  name="phone" size="50"><br><br>
</div>


<input id= "submit" type="submit" value="Submit">
</form>
<form action="https://docs.google.com/document/d/1_pEVfVIJNyIKXttJKaC9kRRPopHhYF_nRtqdLxsGIqA/edit" method="get">
<input id= "VIEW_ER_DIAGRAM" type="Submit" value="VIEW_ER_DIAGRAM">
</form>
</section>
</body>
</html>