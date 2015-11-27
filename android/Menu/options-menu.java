@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    menu.findItem(R.id.action_settings).setVisible(true);
    menu.clear();
    String title = "title";
    menu.add(0, MENU_ITEM_ID, 0, title);
    return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    switch (item.getItemId()) {
    case R.id.action_settings:
        return true;
        break;
    }
    return super.onOptionsItemSelected(item);
}
