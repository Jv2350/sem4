import * as React from 'react';
import { DemoContainer } from '@mui/x-date-pickers/internals/demo';
import { AdapterDayjs } from '@mui/x-date-pickers/AdapterDayjs';
import { LocalizationProvider } from '@mui/x-date-pickers/LocalizationProvider';
import { DateTimePicker } from '@mui/x-date-pickers/DateTimePicker';
import dayjs from 'dayjs';

export default function DateTime() {
    const [startDate, setstartDate] = React.useState(null);
    const [endDate, setendDate] = React.useState(null);
    
  // Handle change in the DateTimePicker value
  const handleDateChangeStart = (date) => {
    setstartDate(date);
    // console.log(new Date(date))
  };
  const handleDateChangeEnd = (date) => {
    setendDate(date);
    // console.log(new Date(date))
  };
  const minDate = dayjs();

  return (
    <LocalizationProvider dateAdapter={AdapterDayjs}>
      <DemoContainer components={['DateTimePicker']}>
        <DateTimePicker label="Set Start Time" value={startDate}
          onChange={handleDateChangeStart} minDate={minDate}/>
        <DateTimePicker label="Set End Time" value={endDate}
          onChange={handleDateChangeEnd} minDate={startDate}/>
      </DemoContainer>
    </LocalizationProvider>
  );
}