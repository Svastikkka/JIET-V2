<html><head><meta name="viewport" content="initial-scale=.80; maximum-scale=.80; minimum-scale=.80;" /><link rel="stylesheet" href="style.css"><style>
.pageblock{width: 100%;margin-left: 0%; margin-top:5.5%;}.maincenterres {width: 85%;}button{display:none;}#detail {font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;font-size: 18px;border-collapse: collapse;margin-bottom:80px;}#detail .info{text-align:left;}#detail td, #detail th {font-size: 1em;line-height: 2.5;padding: 3px 7px 2px 7px;}#detail th {font-size: 1.1em;text-align: left;padding-top: 5px;padding-bottom: 4px;background-color: #2196F3;color: #ffffff;}#detail tr.alt td {color: #000000;background-color: #95CDE3;}.info {size:100%;padding-left: 1em;font-size: 25px;text-align:left;}.rg-container {font-family: Helvetica, Arial, sans-serif;font-size: 16px;line-height: 1;margin: 0;padding: 1em 0;color: #1a1a1a;}table.rg-table {margin: 0 0 1em 0;font-family: Helvetica, Arial, sans-serif;font-size: 18px;border-collapse: collapse;border-spacing: 0;}table.rg-table * {-moz-box-sizing: border-box;box-sizing: border-box;margin: 0;padding: 0;border: 0;font-size: 100%;font: inherit;vertical-align: baseline;text-align: left;color: #333;}table.rg-table thead {border-bottom: 1px solid rgba(195,195,197,.3);}table.rg-table th {font-size: 18px;background-color: #2196F3;color: #ffffff;text-align:center;font-weight: bold;padding: 0.5em;font-size: 0.85em;line-height: 1.4;}table.rg-table td {text-align:center;padding: 0.5em;    font-size: 0.9em;line-height: 1.4;}table.rg-table .highlight td {font-weight: bold;}table.rg-table tr {border-bottom: 1px solid rgba(195,195,197,.3);color: #222;}table.rg-table .number {text-align: right;}table.rg-table.zebra tr:nth-child(even) {background: rgba(195, 195, 197, 0.1);}table.rg-table tr.highlight {background: #edece4;}</style></head><body style="margin:8px;"></body></html>
<?php
    $url = 'http://jietjodhpur.ac.in/midterm/post_data.php';
    if(isset($_GET['roll']))
    {
        $roll_no =$_GET['roll'];
        $login = 'coed';
        $fields_string = 'roll_no='.$roll_no.'&login=coed';
        $ch = curl_init();
        curl_setopt($ch,CURLOPT_URL, $url);
        curl_setopt($ch,CURLOPT_POST, 1);
        curl_setopt($ch,CURLOPT_POSTFIELDS, $fields_string);
        curl_setopt ($ch,CURLOPT_COOKIEFILE,"cookie");
        curl_setopt ($ch,CURLOPT_COOKIEJAR,"cookie");
        $urla='http://jietjodhpur.ac.in/midterm/midterm_show.php';
        $result = curl_exec($ch);
        curl_setopt($ch, CURLOPT_URL, $urla);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
        $data = curl_exec($ch);
        curl_close($ch);
        $Badshah=get_string_between($data,"<div align=\"center\" style=\"margin-top:20px;\">","Back</button>");
        echo "<div align=\"center\" style=\"margin-top:20px;\">".$Badshah."Back</button>";

    }
    else{
        //echo "Type Your Roll no.";
    }
    function get_string_between($string, $start, $end){

        $string = ' ' . $string;
        $ini = strpos($string, $start);
        if ($ini == 0) return '';
        $ini += strlen($start);
        $len = strpos($string, $end, $ini) - $ini;
        return substr($string, $ini, $len);

    }?>